package app;

import java.util.Scanner;

public class GetInputs {
    private String merchantName;
    private String email;
    private String phone;
    private String productName;
    private int quantity;
    private double price;

    public static GetInputs initVars (){
        GetInputs inputs = new GetInputs();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя продавца");
        if(scanner.hasNextLine()) inputs.setMerchantName(scanner.nextLine());
        System.out.println("Введите email продавца " + inputs.getMerchantName());
        if(scanner.hasNextLine()) inputs.setEmail(scanner.nextLine());
        System.out.println("Введите телефон продавца " + inputs.getMerchantName());
        if(scanner.hasNextLine()) inputs.setPhone(scanner.nextLine());
        System.out.println("Введите название продукта");
        if(scanner.hasNextLine()) inputs.setProductName(scanner.nextLine());
        System.out.println("Введите количество продукта "+ inputs.getProductName());
        if(scanner.hasNextInt()) inputs.setQuantity(scanner.nextInt());
        System.out.println("Введите цену еденицы (грн.) "+ inputs.getProductName());
        if(scanner.hasNextDouble()) inputs.setPrice(scanner.nextDouble());
        scanner.close();
        return inputs;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
