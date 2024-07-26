package InterfaceImplementation;

interface Features {
    void dialing();

    void messaging();
}

interface Addons {

    void vcalling();

    void mms();
}

class FeaturePhone implements Features {
    public void dialing() {
        System.out.println("Feature Phone is Dialing");
    }

    public void messaging() {
        System.out.println("Feature Phone is Messaging");
    }
}

class SmartPhone implements Features, Addons {
    public void dialing() {
        System.out.println("Smart  Phone is Dialing");
    }

    public void messaging() {
        System.out.println("Smart Phone is Messaging");
    }

    public void vcalling() {
        System.out.println("Smart Phone is vcalling");

    }

    public void mms() {
        System.out.println("Smart Phone is mms");

    }
}

public class Mobile {
    public static void main(String[] args) {
        FeaturePhone fp = new FeaturePhone();
        SmartPhone sp = new SmartPhone();
        fp.dialing();
        fp.messaging();
        sp.dialing();
        sp.messaging();
        sp.vcalling();
        sp.mms();

    }
}
