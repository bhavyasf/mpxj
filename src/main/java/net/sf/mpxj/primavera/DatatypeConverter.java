/*
 * file:       DatatypeConverter.java
 * author:     Jon Iles
 * copyright:  (c) Packwood Software 2011
 * date:       08/08/2011
 */

/*
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation; either version 2.1 of the License, or (at your
 * option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307, USA.
 */

package net.sf.mpxj.primavera;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * This class contains methods used to perform the datatype conversions
 * required to read and write PM files.
 */
public final class DatatypeConverter
{
   /**
    * Convert the Primavera string representation of a UUID into a Java UUID instance.
    *
    * @param value Primavera UUID
    * @return Java UUID instance
    */
   public static final UUID parseUUID(String value)
   {
      UUID result = null;
      if (value != null && !value.isEmpty())
      {
         if (value.charAt(0) == '{')
         {
            // PMXML representation: <GUID>{0AB9133E-A09A-9648-B98A-B2384894AC44}</GUID>
            result = UUID.fromString(value.substring(1, value.length() - 1));
         }
         else
         {
            if (value.length() == 22)
            {
               // Standard XER representation: CrkTPqCalki5irI4SJSsRA
               byte[] data = javax.xml.bind.DatatypeConverter.parseBase64Binary(value + "==");
               long msb = 0;
               long lsb = 0;

               for (int i = 0; i < 8; i++)
               {
                  msb = (msb << 8) | (data[i] & 0xff);
               }

               for (int i = 8; i < 16; i++)
               {
                  lsb = (lsb << 8) | (data[i] & 0xff);
               }

               result = new UUID(msb, lsb);
            }
            else
            {
               // Non-standard representation
               // In the example XER file I came across this was an integer, but we won't
               // make any assumptions, just generate a UUID from the string's bytes.
               result = UUID.nameUUIDFromBytes(value.getBytes());
            }
         }
      }
      return result;
   }

   /**
    * Retrieve a UUID in the form required by Primavera PMXML.
    *
    * @param guid UUID instance
    * @return formatted UUID
    */
   public static String printUUID(UUID guid)
   {
      return guid == null ? null : "{" + guid.toString().toUpperCase() + "}";
   }

   /**
    * Print a date time value.
    *
    * @param value date time value
    * @return string representation
    */
   public static final String printDateTime(Date value)
   {
      return (value == null ? null : DATE_FORMAT.get().format(value));
   }

   /**
    * Parse a date time value.
    *
    * @param value string representation
    * @return date time value
    */
   public static final Date parseDateTime(String value)
   {
      Date result = null;

      if (value != null && value.length() != 0)
      {
         try
         {
            result = DATE_FORMAT.get().parse(value);
         }

         catch (ParseException ex)
         {
            // Ignore parse exception
         }
      }

      return (result);
   }

   /**
    * Print a time value.
    *
    * @param value time value
    * @return time value
    */
   public static final String printTime(Date value)
   {
      return (value == null ? null : TIME_FORMAT.get().format(value));
   }

   /**
    * Parse a time value.
    *
    * @param value time value
    * @return time value
    */
   public static final Date parseTime(String value)
   {
      Date result = null;
      if (value != null && value.length() != 0)
      {
         try
         {
            result = TIME_FORMAT.get().parse(value);
         }

         catch (ParseException ex)
         {
            // Ignore this and return null
         }
      }
      return result;
   }

   /**
    * Parse a Boolean represented as an integer.
    * 
    * @param value value as text
    * @return Boolean instance
    */
   public static final Boolean parseIntegerBoolean(String value)
   {
      Boolean result;
      if (value == null)
      {
         result = null;
      }
      else
      {
         result = Boolean.valueOf(value.equals("1"));
      }
      return result;
   }

   /**
    * Print a Boolean represented as an integer.
    * 
    * @param value Boolean value
    * @return string representation
    */
   public static final String printIntegerBoolean(Boolean value)
   {
      String result;
      if (value == null)
      {
         result = null;
      }
      else
      {
         result = value.booleanValue() ? "1" : "0";
      }

      return result;
   }

   /**
    * Parse a double value.
    * 
    * @param value Double value as a string
    * @return Double instance
    */
   public static final Double parseDouble(String value)
   {
      // We don't need to provide this method, we could just leave it out
      // of the binding file and fall back on default behaviour, but
      // having the code here avoids boxing warnings from the adapters.
      Double result;
      if (value == null)
      {
         result = null;
      }
      else
      {
         // Fall back on the standard behaviour
         result = Double.valueOf(javax.xml.bind.DatatypeConverter.parseDouble(value));
      }
      return result;
   }

   /**
    * Print a double value. P6 seems to be fussy about having values
    * without decimals if they are whole numbers, hence the need for this method.
    * 
    * @param value double value
    * @return string representation
    */
   public static final String printDouble(Double value)
   {
      String result;
      if (value == null)
      {
         result = null;
      }
      else
      {
         result = DOUBLE_FORMAT.get().format(value.doubleValue());
      }

      return result;
   }

   private static final ThreadLocal<DateFormat> DATE_FORMAT = new ThreadLocal<DateFormat>()
   {
      @Override protected DateFormat initialValue()
      {
         DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
         df.setLenient(false);
         return df;
      }
   };

   private static final ThreadLocal<DateFormat> TIME_FORMAT = new ThreadLocal<DateFormat>()
   {
      @Override protected DateFormat initialValue()
      {
         DateFormat df = new SimpleDateFormat("HH:mm:ss");
         df.setLenient(false);
         return df;
      }
   };

   private static final ThreadLocal<NumberFormat> DOUBLE_FORMAT = new ThreadLocal<NumberFormat>()
   {
      @Override protected NumberFormat initialValue()
      {
         DecimalFormat format = new DecimalFormat("#.##");
         format.setGroupingUsed(false);
         return format;
      }
   };
}
