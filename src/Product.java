/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Study (ICBT)
 */
public class Product {
    private String ProductCode;
    private String ProductName;
    private int ProductPrice;
    private String ProductType;

    /**
     * @return the ProductCode
     */
    public String getProductCode() {
        return ProductCode;
    }

    /**
     * @param ProductCode the ProductCode to set
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * @return the ProductName
     */
    public String getProductName() {
        return ProductName;
    }

    /**
     * @param ProductName the ProductName to set
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * @return the ProductPrice
     */
    public int getProductPrice() {
        return ProductPrice;
    }

    /**
     * @param ProductPrice the ProductPrice to set
     */
    public void setProductPrice(int ProductPrice) {
        this.ProductPrice = ProductPrice;
    }

    /**
     * @return the ProductType
     */
    public String getProductType() {
        return ProductType;
    }

    /**
     * @param ProductType the ProductType to set
     */
    public void setProductType(String ProductType) {
        this.ProductType = ProductType;
    }
    
    public void Addproduct(Product obj)
    {
        String Productstring =  obj.getProductCode()+","+ obj.getProductName()+","+String.valueOf(obj.getProductPrice())+","+ obj.getProductType();
        DBconnection db = new DBconnection();
        db.makeconnection(Productstring);
                 
    }
            
    
}
