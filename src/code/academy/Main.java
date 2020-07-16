package code.academy;

public class Main {

    public static void main(String[] args) {

        Map<DnsProvider, DnsServer> mapas = new Map<>();
        mapas.addToMap(DnsProvider.AMAZON, new DnsServer("123.123.123.123", "222.222.222.222"));
        mapas.addToMap(DnsProvider.GOOGLE, new DnsServer("111.111.123.123", "000.000.000.000"));

        for (Pair<DnsProvider, DnsServer> pair : mapas.getListOfPairs()) {
            System.out.println(String.format("pair key: %s and value: %s", pair.getKey(), pair.getValue()));

        }
        System.out.println(mapas.getValue(DnsProvider.GOOGLE));
    }
}
