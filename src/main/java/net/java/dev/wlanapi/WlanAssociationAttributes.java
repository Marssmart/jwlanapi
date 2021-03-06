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
import com.sun.jna.platform.win32.WinDef.ULONG;
import java.util.Arrays;
import java.util.List;

public class WlanAssociationAttributes extends Structure {

  public Dot11Ssid dot11Ssid;

  public int dot11BssType;

  public char[] dot11Bssid;

  public int dot11PhyType;

  public ULONG uDot11PhyIndex;

  public long wlanSignalQuality;

  public ULONG ulRxRate;

  public ULONG ulTxRate;

  public WlanAssociationAttributes() {
    dot11Bssid = new char[6];
  }

  @Override
  protected List<String> getFieldOrder() {
    return Arrays.asList("dot11Ssid", "dot11BssType", "dot11Bssid", "dot11PhyType",
        "uDot11PhyIndex", "wlanSignalQuality", "ulRxRate", "ulTxRate");
  }

}
