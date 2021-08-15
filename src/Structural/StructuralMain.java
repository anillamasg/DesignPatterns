package Structural;

import Structural.Decorator.*;

public class StructuralMain {
    public static void main(String[] args) {
        Coffee coffee = new Espresso();
        coffee = new AlternativeMilkDecorator(coffee);
        coffee = new SyrupDecorator(coffee);

        System.out.println("Price of your coffee: "+coffee.getPrice());
    }
}

/*
//////////////////////////////////////          ADAPTER DESIGN PATTERN          ////////////////////////////////////////

    Iphone iphone = new Iphone();
    Samsung samsung = new Samsung();

    iphone.charge(new IphoneCharger());
    samsung.charge(new SamsungCharger());

    iphone.charge(new IphoneChargerAdapter(new SamsungCharger()));

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//////////////////////////////////////          BRIDGE DESIGN PATTERN          ////////////////////////////////////////

    Device device = new Radio();
    RemoteControl remote = new ClassicRemoteControl(device);
    remote.togglePower();
    remote.volumeUp();
    remote.volumeDown();
    remote.channelUp();
    remote.channelDown();
    remote.togglePower();

    System.out.println("\n");

    device = new Tv();
    remote = new AdvancedRemoteControl(device);
    remote.togglePower();
    remote.volumeUp();

    ((AdvancedRemoteControl) remote).brightnessUp();
    ((AdvancedRemoteControl) remote).brightnessDown();
    ((AdvancedRemoteControl) remote).muteVolume();

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//////////////////////////////////////          COMPOSITE DESIGN PATTERN          ////////////////////////////////////////

    ProjectSalary pa = new ProjectSalary();
    FrontSalary front = new FrontSalary();
    BackSalary back = new BackSalary();
    EmployeeSalary e1 = new EmployeeSalary();
    EmployeeSalary e2 = new EmployeeSalary();
    EmployeeSalary e3 = new EmployeeSalary();
    EmployeeSalary e4 = new EmployeeSalary();
    EmployeeSalary e5 = new EmployeeSalary();

    front.addEmployeeSalary(e1);
    front.addEmployeeSalary(e2);
    front.addEmployeeSalary(e3);

    back.addEmployeeSalary(e4);
    back.addEmployeeSalary(e5);

    pa.addEmployeeSalary(front);
    pa.addEmployeeSalary(back);

    System.out.println("Employee1 salary: "+e1.getTotalSalary());
    System.out.println("Front salary: "+front.getTotalSalary());
    System.out.println("Back salary: "+back.getTotalSalary());
    System.out.println("Total project salary: "+pa.getTotalSalary());

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

*/
