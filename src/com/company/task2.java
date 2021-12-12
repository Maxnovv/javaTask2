package com.company;
interface Computer
{
    void on() ;
    void off() ;
    void connect() ;

}
abstract class PortablePC implements Computer{

}
abstract class DesktopPC implements Computer  {

}
class Desktop extends DesktopPC implements Computer {
    public Desktop(int ram, String cpu, String gpu, int rom)
    {
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.rom = rom;
    }
    int ram;
    String cpu;
    String gpu;
    int rom;
    public void on()
    {
        System.out.println("ПК с характеристиками");
        System.out.println("Процессор: " + cpu);
        System.out.println("ОЗУ: " + ram);
        System.out.println("Видеокарта: " + gpu);
        System.out.println("Жесткий диск: " + rom);
        System.out.println("Включение");
    }
    public void off()
    {
        System.out.println("ПК с характеристиками");
        System.out.println("Процессор: " + cpu);
        System.out.println("ОЗУ: " + ram);
        System.out.println("Видеокарта: " + gpu);
        System.out.println("Жесткий диск: " + rom);
        System.out.println("Выключение");
    }
    public void connect()
    {
        System.out.println("ПК с характеристиками");
        System.out.println("Процессор: " + cpu);
        System.out.println("ОЗУ: " + ram);
        System.out.println("Видеокарта: " + gpu);
        System.out.println("Жесткий диск: " + rom);
        System.out.println("Подключился к интернету");
    }
}
class Laptop extends PortablePC implements  Computer
{
    public Laptop(int ram,String cpu,int rom,Display display,Keyboard keyboard)
    {
        this.ram = ram;
        this.cpu = cpu;
        this.rom = rom;
        this.display = display;
        this.keyboard = keyboard;
    }
    int ram;
    String cpu;
    int rom;
    Display display;
    Keyboard keyboard;
    public void on()
    {
        System.out.println("Ноутбук с характеристиками");
        System.out.println("Процессор: " + cpu);
        System.out.println("ОЗУ: " + ram);
        System.out.println("Жесткий диск: " + rom);
        System.out.println("Клавиатура: " + keyboard);
        System.out.println("Монитор: " + display);
        System.out.println("Включение");
    }
    public void off()
    {
        System.out.println("Ноутбук с характеристиками");
        System.out.println("Процессор: " + cpu);
        System.out.println("ОЗУ: " + ram);
        System.out.println("Жесткий диск: " + rom);
        System.out.println("Клавиатура: " + keyboard);
        System.out.println("Монитор: " + display);
        System.out.println("Выключение");
    }
    public void connect()
    {
        System.out.println("Ноутбук с характеристиками");
        System.out.println("Процессор: " + cpu);
        System.out.println("ОЗУ: " + ram);
        System.out.println("Жесткий диск: " + rom);
        System.out.println("Клавиатура: " + keyboard);
        System.out.println("Монитор: " + display);
        System.out.println("Подключился к интернету");
    }


}
class Netbook extends PortablePC implements Computer
{
    public Netbook(int ram,String cpu,int rom, Display display,Keyboard keyboard)
    {
        this.ram = ram;
        this.cpu = cpu;
        this.rom = rom;
        this.display = display;
        this.keyboard = keyboard;
    }
    int ram;
    String cpu;
    int rom;
    Display display;
    Keyboard keyboard;
    public void on()
    {
        System.out.println("Нетбук с характеристиками");
        System.out.println("Процессор: " + cpu);
        System.out.println("ОЗУ: " + ram);
        System.out.println("Жесткий диск: " + rom);
        System.out.println("Клавиатура: " + keyboard);
        System.out.println("Монитор: " + display);
        System.out.println("Включение");
    }
    public void off()
    {
        System.out.println("Нетбук с характеристиками");
        System.out.println("Процессор: " + cpu);
        System.out.println("ОЗУ: " + ram);
        System.out.println("Жесткий диск: " + rom);
        System.out.println("Клавиатура: " + keyboard);
        System.out.println("Монитор: " + display);
        System.out.println("Выключение");
    }
    public void connect()
    {
        System.out.println("Нетбук с характеристиками");
        System.out.println("Процессор: " + cpu);
        System.out.println("ОЗУ: " + ram);
        System.out.println("Жесткий диск: " + rom);
        System.out.println("Клавиатура: " + keyboard);
        System.out.println("Монитор: " + display);
        System.out.println("Подключился к интернету");
    }
}
class Monoblock extends DesktopPC implements Computer
{
    public Monoblock(int ram,String cpu, int rom,Display display)
    {
        this.ram = ram;
        this.cpu = cpu;
        this.rom = rom;
        this.display = display;
    }
    int ram;
    String cpu;
    int rom;
    Display display;
    public void on()
    {
        System.out.println("Моноблок с характеристиками");
        System.out.println("Процессор: " + cpu);
        System.out.println("ОЗУ: " + ram);
        System.out.println("Жесткий диск: " + rom);
        System.out.println("Монитор: " + display);
        System.out.println("Включение");
    }
    public void off()
    {
        System.out.println("Моноблок с характеристиками");
        System.out.println("Процессор: " + cpu);
        System.out.println("ОЗУ: " + ram);
        System.out.println("Жесткий диск: " + rom);
        System.out.println("Монитор: " + display);
        System.out.println("Выключение");
    }
    public void connect()
    {
        System.out.println("Моноблок с характеристиками");
        System.out.println("Процессор: " + cpu);
        System.out.println("ОЗУ: " + ram);
        System.out.println("Жесткий диск: " + rom);
        System.out.println("Монитор: " + display);
        System.out.println("Подключился к интернету");
    }
}
class Server implements Computer {
    public Server(int ram,String  cpu,int rom)
    {
        this.ram = ram;
        this.cpu = cpu;
        this.rom = rom;
    }
    int ram;
    String cpu;
    int rom;
    public void on()
    {
        System.out.println("Сервер с характеристиками");
        System.out.println("Процессор: " + cpu);
        System.out.println("ОЗУ: " + ram);
        System.out.println("Жесткий диск: " + rom);
        System.out.println("Включение");
    }
    public void off()
    {
        System.out.println("Сервер с характеристиками");
        System.out.println("Процессор: " + cpu);
        System.out.println("ОЗУ: " + ram);
        System.out.println("Жесткий диск: " + rom);
        System.out.println("Выключение");
    }
    public void connect()
    {
        System.out.println("Сервер с характеристиками");
        System.out.println("Процессор: " + cpu);
        System.out.println("ОЗУ: " + ram);
        System.out.println("Жесткий диск: " + rom);
        System.out.println("Подключился к интернету");
    }

}
class Nettop extends PortablePC implements Computer {
    public Nettop(int ram,String cpu, int rom)
    {
        this.ram = ram;
        this.cpu = cpu;
        this.rom = rom;
    }
    int ram;
    String cpu;
    int rom;
    public void on()
    {
        System.out.println("Неттоп с характеристиками");
        System.out.println("Процессор: " + cpu);
        System.out.println("ОЗУ: " + ram);
        System.out.println("Жесткий диск: " + rom);
        System.out.println("Включение");
    }
    public void off()
    {
        System.out.println("Неттоп с характеристиками");
        System.out.println("Процессор: " + cpu);
        System.out.println("ОЗУ: " + ram);
        System.out.println("Жесткий диск: " + rom);
        System.out.println("Выключение");
    }
    public void connect()
    {
        System.out.println("Неттоп с характеристиками");
        System.out.println("Процессор: " + cpu);
        System.out.println("ОЗУ: " + ram);
        System.out.println("Жесткий диск: " + rom);
        System.out.println("Подключился к интернету");
    }
}
class Display {
    String name;
    public Display(String name)
    {
        this.name = name;
    }
    public String toString()
    {
        return name;
    }
}
class Keyboard {
    String name;
    public Keyboard(String name)
    {
        this.name = name;
    }
    public String toString()
    {
        return name;
    }
}
public class task2 {
    public static void main(String[] args)
    {
        Keyboard keyboard = new Keyboard("Defender");
        Display display = new Display("AOC");
        Desktop desktop = new Desktop(8,"i7","1080",512);
        Laptop laptop = new Laptop(4,"i3",128,display,keyboard);
        Monoblock monoblock = new Monoblock(16,"i5",256,display);
        Netbook netbook = new Netbook(2,"pentium",64,display,keyboard);
        Nettop nettop = new Nettop(4,"i3",128);
        Server server = new Server(32,"i7",1024);
        Computer[] computer = new Computer[6];
        computer[0] = desktop;
        computer[1] = laptop;
        computer[2] = monoblock;
        computer[3] = netbook;
        computer[4] = nettop;
        computer[5] = server;
        for(int i = 0;i<6;i++)
        {
            computer[i].on();
            computer[i].connect();
            computer[i].off();
        }

    }
}
