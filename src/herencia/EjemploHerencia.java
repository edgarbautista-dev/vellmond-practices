package herencia;

class Animal{
    String nombre;
    public void respirar(){
        System.out.println("Soy un animal y estoy respirando");
    }

}

class Perro extends Animal{

}

class Gato extends Animal{

}

public class EjemploHerencia {
    public static void main(String[] args) {
        Animal a = new Animal();
        Perro p = new Perro();
        p.nombre = "Firulais";
        p.respirar();
        Gato g = new Gato();
        g.respirar();
        System.out.println(a instanceof Animal);//true
        System.out.println(a instanceof Object);//Todos los objetos son instancias de la clase Object
        System.out.println(a instanceof Perro);//Un objeto de la clase Animal no es instancia de la clase Perro
        System.out.println(a instanceof Gato);//Un objeto de la clase Animal no es instancia de la clase Gato
        System.out.println(p instanceof Animal);//Un objeto de la clase Perro es instancia de la clase Animal
        System.out.println(p instanceof Object);//Todos los objetos son instancias de la clase Object
        System.out.println(p instanceof Perro);//Un objeto de la clase Perro es instancia de la clase Perro
        System.out.println(g instanceof Animal);//Un objeto de la clase Gato es instancia de la clase Animal
        System.out.println(g instanceof Object);//Todos los objetos son instancias de la clase Object
        System.out.println(g instanceof Gato);//Un objeto de la clase Gato es instancia de la clase Gato
    }
}
