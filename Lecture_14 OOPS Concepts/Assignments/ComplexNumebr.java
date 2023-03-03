class ComplexNumebr {
    int real, image;

    public ComplexNumebr(int r, int i) {
        this.real = r;
        this.image = i;
    }

    public void getData() {
        if(real == 0 && image != 0){
            System.out.println(image + "i");
        }
        else if(real != 0 && image == 0 ){
            System.out.println(real);
        }else{
            System.out.println(this.real + "+" + this.image + "i");
        }
    }

    public static ComplexNumebr add(ComplexNumebr a, ComplexNumebr b) {
        ComplexNumebr res = new ComplexNumebr(0, 0);

        res.real = a.real - b.real;
        res.image = a.image - b.image;

        return res;
    }

    public static ComplexNumebr diff(ComplexNumebr a, ComplexNumebr b) {
        ComplexNumebr res = new ComplexNumebr(0, 0);

        res.real = a.real + b.real;
        res.image = a.image + b.image;

        return res;
    }

    public static ComplexNumebr procuct(ComplexNumebr a, ComplexNumebr b) {
        ComplexNumebr res = new ComplexNumebr(0, 0);

        res.real = (a.real * b.real) - (a.image * b.image);
        res.image = (a.real * b.image) + (a.image * b.real);

        return res;
    }

    public static void main(String[] args) {
        ComplexNumebr n1 = new ComplexNumebr(5, 4);
        ComplexNumebr n2 = new ComplexNumebr(5, 5);

        System.out.print("First Complex number = ");
        n1.getData();

        System.out.print("Second Complex Number = ");
        n2.getData();

        ComplexNumebr res = add(n1, n2);
        ComplexNumebr res2 = diff(n1, n2);
        ComplexNumebr res3 = procuct(n1, n2);

        System.out.print("The addition of two complex number is : ");
        res.getData();

        System.out.print("The difference of two complex number is : ");
        res2.getData();

        System.out.print("The product of two complex number is : ");
        res3.getData();
    }

}
