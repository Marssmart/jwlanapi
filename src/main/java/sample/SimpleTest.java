package sample;

import java.util.List;
import java.util.concurrent.TimeUnit;
import net.java.dev.wlanapi.ScanResult;
import net.java.dev.wlanapi.WifiManager;

/**
 * Created by i.perezdealbeniz on 29/12/2016.
 */
public class SimpleTest {

  public static void main(String[] args) throws InterruptedException {
    System.out.println("\nJava wlanapi.dll Wrapper Test:\n******************************\n");
    WifiManager wlan_manager = new WifiManager();

    System.out.printf("Wifi Enabled: %s\n\n", wlan_manager.isWifiEnabled());

    System.out.println("Detected Wifi Networks:\n");
    List<ScanResult> scan_results = wlan_manager.waitForScanResults(5,
        TimeUnit.SECONDS);
    for (int i = 0; i < scan_results.size(); i++) {
      System.out.println("\t SSID : " + scan_results.get(i).SSID);
      System.out.println("\t\t BSSID : " + scan_results.get(i).BSSID);
      System.out.println("\t\t Frequency (MHz): " +
          Integer.toString(scan_results.get(i).frequency));
      System.out.println("\t\t Signal Level (db) : " +
          Integer.toString(scan_results.get(i).level));
      System.out.println("\t\t Capabilities : " +
          scan_results.get(i).capabilities);
      System.out.println();
    }

    System.out.println("Configured Wifi Networks:");
    List<String> configured_networks = wlan_manager.getConfiguredNetworks();
    for (int i = 0; i < scan_results.size(); i++) {
      System.out.println("\t" + Integer.toString(i) + "\t" + scan_results.get(i));
    }
  }

}
