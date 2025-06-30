class employee{

    public void display(int id,String name){
        System.out.println("id:"+ id);
        System.out.println("name:"+ name);

    }
    public static void main(String[] args) {
        // display(23, "Karthikeyan");
        // display(40, "Rohith");
        employee obj = new employee();
        obj.display(23, "Karthikeyan");
        obj.display(40, "Rohith");


    }
}




