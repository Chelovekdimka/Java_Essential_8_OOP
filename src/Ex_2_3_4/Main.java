package Ex_2_3_4;

public class Main {
    public static void main(String[] args) {
        Device device1 = new Device("Samsung", 120f, "AB1234567CD");
        Device device2 = new Device("Samsung", 120f, "AB1234567CD");
        Device device3 = new Device("LG", 100f, "EF9876543GH");

        Monitor monitor1 = new Monitor("Samsung", 200f, "AB2345678CD", 1280, 1024);
        Monitor monitor2 = new Monitor("Samsung", 200f, "AB2345678CD", 1280, 1024);
        Monitor monitor3 = new Monitor("LG", 150f, "EF8765432GH", 1920, 1080);

        EthernetAdapter adapter1 = new EthernetAdapter("TP-Link", 300, "AB2345678CD", 180,"1A2B3C4D");
        EthernetAdapter adapter2 = new EthernetAdapter("TP-Link", 300, "AB2345678CD", 180,"1A2B3C4D");
        EthernetAdapter adapter3 = new EthernetAdapter("D-Link", 300, "AB2345678CD", 180,"1A2B3C4D");
        System.out.println();

        // перевизначення методів toString()

        System.out.println(device1.toString());
        System.out.println(monitor1.toString());
        System.out.println(adapter1.toString());
        System.out.println();

        // перевизначення методу equals()

        System.out.println(device1.equals(device2));
        System.out.println(device1.equals(device3));

        System.out.println(monitor1.equals(monitor2));
        System.out.println(monitor1.equals(monitor3));

        System.out.println(adapter1.equals(adapter2));
        System.out.println(adapter1.equals(adapter3));
        System.out.println();

        // перевизначення методу hashCode()

        System.out.println(device1.hashCode() == device2.hashCode());
        System.out.println(device1.hashCode() == device3.hashCode());

        System.out.println(monitor1.hashCode() == monitor2.hashCode());
        System.out.println(monitor1.hashCode() == monitor3.hashCode());

        System.out.println(adapter1.hashCode() == adapter2.hashCode());
        System.out.println(adapter1.hashCode() == adapter3.hashCode());
    }
}
