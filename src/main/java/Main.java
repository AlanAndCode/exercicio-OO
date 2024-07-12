public class Main {
    private int lado1;
    private int lado2;
    private int lado3;

    public Main(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    public static boolean verificaTriangulo(int lado1, int lado2, int lado3) {
        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
    }

    public static int perimetro(int lado1, int lado2, int lado3) {
        return lado1 + lado2 + lado3;
    }

    public static int area(int lado1, int lado2, int lado3) {
        int peri = perimetro(lado1, lado2, lado3) / 2;
        int area = (int)Math.sqrt(peri * (peri - lado1) * (peri - lado2) * (peri - lado3));
        return area;
    }





  public static void main(String[] args) {
          // Criar uma instância do Controller e chamar o método main
          Controller controller = new Controller();
          controller.main(args);
      }
  }
