package com.company;

public class ACtype {
    String acType;

    public ACtype(String acType) {
        this.acType = acType;
        whatACtype();
    }

    public void whatACtype(){
        System.out.println("The AC type is "+ this.acType );
    }

    public String getAcType() {
        return acType;
    }
}
