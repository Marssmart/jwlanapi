/*******************************************************************************
 *  Copyright AllSeen Alliance. All rights reserved.
 *
 *     Permission to use, copy, modify, and/or distribute this software for any
 *     purpose with or without fee is hereby granted, provided that the above
 *     copyright notice and this permission notice appear in all copies.
 *
 *     THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 *     WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 *     MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
 *     ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 *     WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 *     ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
 *     OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 *******************************************************************************/
package net.java.dev.wlanapi;

import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

/**
 * Packages the object type, version, and size information that is required in many NDIS 6.0
 * structures.
 */
public class NdisObjectHeader extends Structure {

  /**
   * Specifies the type of NDIS Object that a structure describes.
   */
  public char Type;

  /**
   * Specifies the revision number of this structure.
   */
  public char Revision;

  /**
   * Specifies the total size, in bytes, of the NDIS structure that contains the NDIS_OBJECT_HEADER.
   * This size includes the size of the NDIS_OBJECT_HEADER member and all other members of the
   * structure.
   */
  public short Size;

  @Override
  protected List<String> getFieldOrder() {
    return Arrays.asList("Type", "Revision", "Size");
  }
}
