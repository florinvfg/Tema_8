
    public class Campana extends Instrumento {
   
        // implementamos el método abstracto interpretar de la superclase Instrumento
          
        void interpretar() {
               System.out.println("Interpretando la melodia con una campana:");
               for (Nota nota : melodia) {
                   switch (nota) {
                       case DO:
                           System.out.println("Ding");
                           break;
                       case RE:
                           System.out.println("Dong");
                           break;
                       case MI:
                           System.out.println("Ding Ding");
                           break;
                       case FA:
                           System.out.println("Ding Dong");
                           break;
                       case SOL:
                           System.out.println("Ding Ding Dong");
                           break;
                       case LA:
                           System.out.println("Ding Ding Ding");
                           break;
                       case SI:
                           System.out.println("Dong Dong Dong");
                           break;
                   }
               }
           }
       }
       
    

