package hw7;

public enum Size {
    XXS( "Размер XXS",32 ),
    XS( "Размер XS",34 ),
    S( "Размер S",36 ),
    M( "Размер M",38 ),
    L( "Размер L",40 );

    private String name;
     int euro;
    {
        for (Size size:Size.values())
              {
                  System.out.println(size);

        }
    }

    Size ( int euro) {
        this.euro= euro;
    }

    Size(String name) {
        this.name = name;
    }

    Size (String desc, int euro) {

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName()  ;
    }

//    private String getEuroSize() {
//        if (getName() == XXS) {
//            System.out.println( 32 );
//        } else if (getName() == XS) {
//            System.out.println( 34 );
//        }
//        if (getName() == S) {
//            System.out.println( 36 );
//        } else if (getName() == M) {
//            System.out.println( 38 );
//        }
//        System.out.println( 40 );
//    }
//
//
//
//    void getDiscription(String Size ) {
//        if (Size == XXS) {
//            System.out.println( "Детский размер" );
//        }
//        System.out.println( "Взрослый размер" );
//
//    }

    void getEuroSize (Size euro) {
        if (euro == XXS) {
            System.out.println(32);
        }
        else if (euro == XS) {
            System.out.println(34);
        }
        if (euro== S) {
            System.out.println(36);
        }
        else if (euro==M) {
            System.out.println(38);
        }
        System.out.println(40);
    }
}

