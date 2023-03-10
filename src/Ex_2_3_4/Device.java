//Створити класи: 1) Основний клас Device (manufacturer(String), price(float),
//        serialNumber(String)); 2) Сабклас Monitor (resolutionX(int), resolutionY(int))
//        і EthernetAdapter (speed(int), mac(String)); Додати методи доступу. Конструктор.
//В обох класах перевизначити метод toString, щоб висновок був наступним:
//        Device: manufacturer = Samsung, price = 120, serialNumber=AB1234567CD, X=1280,Y=1024.
//Перевизначити методи equals & hashCode у кожному класі.
//        Створити клас Main, де створити об'єкти класів і продемонструвати перевизначені методи.

package Ex_2_3_4;

import java.util.Objects;

public class Device {
    private String manufacturer;
    private float price;
    private String serialNumber;

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    @Override
    public String toString() {
        return "Device: manufacturer=" + manufacturer +
                ", price=" + price +
                ", serialNumber=" + serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return Float.compare(device.price, price) == 0 && manufacturer.equals(device.manufacturer) && serialNumber.equals(device.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, price, serialNumber);
    }
}
