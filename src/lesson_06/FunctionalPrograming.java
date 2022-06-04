package lesson_06;
//Template | Blueprint
public class FunctionalPrograming {

    //what to solve
    //maygatdaplienhop
    //ban thiet ke
    public void gatlua(String cayLua){
        System.out.println(cayLua);
    }

    public void xaylua(String hatLua){
        System.out.println("Dang xay" + hatLua);
    }

    public static void main(String[] args) {
        //tao ra 1 may gatdaplien hop
        FunctionalPrograming mayGatDapLienHop = new FunctionalPrograming();  //goi ong tho, default
        //tinh nang, tao ra 1 object tu 1 ban ve
        //gom nhom
        // . goi la dot notation
        mayGatDapLienHop.gatlua("Cay Lua");
        mayGatDapLienHop.xaylua("Hat Lua");

    }
}
