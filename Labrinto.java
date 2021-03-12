import java.util.Stack;
/**
 * Write a description of class Labrinto here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Labrinto
{
   public static void main()
   {
       System.out.print('\u000c');   
       int [][]labrinto = {{-2,-2,-2,-2,-2,-2,-2,-2,-2,-2},
                           {-2,0,0,0,-2,-2,-2,0,-2,-2},
                           {-2,0,-2,0,0,0,-2,0,0,0},
                           {-2,0,-2,-2,-2,-2,-2,0,-2,-2},
                           {-2,0,-2,0,0,0,-2,0,-2,-2},
                           {0,0,-2,0,-2,0,0,0,0,-2},
                           {-2,0,0,0,-2,-2,-2,0,-2,-2},
                           {-2,0,-2,0,-2,0,0,0,0,-2},
                           {-2,0,-2,0,0,0,-2,0,-2,-2},
                           {-2,-2,-2,-2,-2,-2,-2,-2,-2,-2}};  
                           
                           
                           Stack <Integer>pila = new Stack();
                           /*pila.push(7);
                           pila.push(3);
                           pila.push(4);
                           if(!pila.empty())
                           {
                             int x = (Integer)pila.pop();   
                           }
                           System.out.print(pila);
                           */
           int rowactual = 5;
           int colactual = 0;
           do
           { 
                  if(colactual+1<labrinto.length && labrinto[rowactual][colactual+1]==0)
               {
                           labrinto[rowactual][colactual]=-1;
                           pila.push(rowactual*10 + colactual);
                           colactual++;
                           labrinto[rowactual][colactual]=1;
                }
                else 
                    if(rowactual-1 >= 0 && labrinto[rowactual-1][colactual]==0)
                     {
                       labrinto[rowactual][colactual]=-1;
                       pila.push(rowactual*10 + colactual);
                       rowactual--;
                       labrinto[rowactual][colactual]=1;
                    }
                    else
                        if(colactual-1>=0 && labrinto[rowactual][colactual-1]==0)
                        {
                               labrinto[rowactual][colactual]=-1;
                               pila.push(rowactual*10 + colactual);
                               colactual--;
                               labrinto[rowactual][colactual]=1;
                        }
                        else 
                            if(rowactual+1 < labrinto.length && labrinto[rowactual+1][colactual]==0)
                        {
                           labrinto[rowactual][colactual]=-1;
                           pila.push(rowactual*10 + colactual);
                           rowactual++;
                           labrinto[rowactual][colactual]=1;
                        }
                        else
                        {
                            labrinto[rowactual][colactual]=-1;
                            if (!pila.empty())
                            {
                             int x = (Integer)pila.pop();
                             rowactual = x/10;
                             colactual = x % 10;
                             labrinto[rowactual][colactual]=1;
                           }
                            
                            
                        }
            }
            while(rowactual*10+colactual!=29);
            
            System.out.print(pila);
   }
}
