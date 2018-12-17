/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

/**
 *
 * @author fer_1
 */


public class LexemasAutomata {
    String TextoI;
    int Act;
    private char Siguiente(int i)
    {
        if(i == TextoI.length()){
            return ' ';
        }else{
            //System.out.println(TextoI.charAt(i));
            return TextoI.charAt(i);
            
        }
    }
    public Boolean Reconoce(String TextoAutomata,TokensAutomata analisisLexico, int noAuto)
    {
        char c;
        TextoI = TextoAutomata;
        String lenguaje;
        switch(noAuto)
        {
            case 0 : Act=0;
            break;
            
            case 1: Act=3;
            break;
            
            case 2: Act=6;
            break;
            
            case 3: Act=9;
            break;
            
            case 4: Act=11;
            break;
            
            case 5: Act=16;
            break;
            
            case 6: Act=18;
            break;
            
        }
        while(analisisLexico.getI()<=TextoI.length()){
            //System.out.println(analisisLexico.getI());
            switch (Act)
            {
                case 0: c=Siguiente(analisisLexico.getI());
                    analisisLexico.setI(analisisLexico.getI()+1);
                    if((lenguaje=" \n\r\t").indexOf(c)>=0){
                        Act=1;
                        
                     }else
                            {
                                 analisisLexico.setI(analisisLexico.getTokenInicia());
                                    return false;
                            }
                break;
                
                case 1: c=Siguiente(analisisLexico.getI());
                analisisLexico.setI(analisisLexico.getI()+1);
                if(((lenguaje=" \n\r\t")).indexOf(c)>=0){
                 Act=1;   
                }else
                    if((lenguaje="\n\r\t\"\' \\ //!#$%&//.—,-^+~°|(){}*:@#?¡…~¿-+0123456789:;<=>?áéíóúÁÉÍÓÚABCDEFGHIJKLMNñÑOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz[]").indexOf(c)>=0){
                        Act=2;
                        
                    }else{
                        analisisLexico.setI(analisisLexico.getTokenInicia());
                        
                        return false;
                    }
                
                break;
                  
                
                case 2: analisisLexico.setI(analisisLexico.getI()-1);
                System.out.println(analisisLexico.getI()-1+"sdasdas");
                                return true;
                    
                    //Automata ID
                                
                case 3: 
                    c=Siguiente(analisisLexico.getI());
                analisisLexico.setI(analisisLexico.getI()+1);
                if((lenguaje="bcdfghjklmnpqrstvwxyzBCDFGHIJKLMNPQRSTVWXYZ").indexOf(c)>=0){
                    Act=4;
                }else
                {
                    analisisLexico.setI(analisisLexico.getTokenInicia()); 
                    return false;
                }                
                 break;
                 
               case 4: 
                    c=Siguiente(analisisLexico.getI());
                analisisLexico.setI(analisisLexico.getI()+1);
                if((lenguaje="bcdfghjklmnpqrstvwxyzBCDFGHIJKLMNPQRSTVWXYZ").indexOf(c)>=0){
                    Act=26;
                }else
                {
                    analisisLexico.setI(analisisLexico.getTokenInicia()); 
                    return false;
                }                
                 break;
                    
               case 26: 
               c=Siguiente(analisisLexico.getI());
                        analisisLexico.setI(analisisLexico.getI()+1);
                        if((lenguaje="ABCDEFGHIJKLMNOPQRSTUVñÑWXYZabcdefghiíjklmnopqrstuvwxyzáéíóúÁÉÍÓÚ").indexOf(c)>=0){
                            
                            Act=5;
                        }else
                            if((lenguaje="_:;").indexOf(c)>=0){
                                Act=5;
                            }else
                                if((lenguaje="0123456789").indexOf(c)>=0){
                                    Act=5;
                                }else
                                    if((lenguaje=" \n\r\t!.,;?'\"\"\\//¿¡.,¿||&¡~°!/—#$%…&/+*-()/*-+@[]#@^={}:").indexOf(c)>=0){
                                        Act=5;
                                    }else{
                                        analisisLexico.setI(analisisLexico.getTokenInicia());
                                        return false;
                                    }
                 break;
                    
                 
                case 5: 
                    analisisLexico.setI(analisisLexico.getI());
                    return true;
                    
                                
                            
                                
                case 6: c=Siguiente(analisisLexico.getI());
                    analisisLexico.setI(analisisLexico.getI()+1);
                    if((lenguaje="ABCDEFGHIJKLMNOPQRSTUVWXYñÑZabcdefghijklmnopqrstuvwxyzáéíóúÁÉÍÓÚ").indexOf(c)>=0){
                        //1System.out.println(lenguaje);
                        Act=7;
                    }else
                        if((lenguaje="_").indexOf(c)>=0){
                            Act=7;
                        }else{
                            analisisLexico.setI(analisisLexico.getTokenInicia());
                            return false;
                        }
                break;
                
                
                
                case 7: c=Siguiente(analisisLexico.getI());
                        analisisLexico.setI(analisisLexico.getI()+1);
                        if((lenguaje="ABCDEFGHIJKLMNOPQRSTUVñÑWXYZabcdefghiíjklmnopqrstuvwxyzáéíóúÁÉÍÓÚ").indexOf(c)>=0){
                            
                            Act=7;
                        }else
                            if((lenguaje="_:;").indexOf(c)>=0){
                                Act=7;
                            }else
                                if((lenguaje="0123456789").indexOf(c)>=0){
                                    Act=7;
                                }else
                                    if((lenguaje=" \n\r\t!.,;?'\"\"\\//¿¡.,¿||&¡~°!/—#$%…&/+*-()/*-+@[]#@^={}:").indexOf(c)>=0){
                                        Act=8;
                                    }else{
                                        analisisLexico.setI(analisisLexico.getTokenInicia());
                                        return false;
                                    }
                 break;
                
                                    
                                    
                case 8: analisisLexico.setI(analisisLexico.getI()-1);
                return true;
                
                
                
                //Caracteres
                 case 9: c=Siguiente(analisisLexico.getI());
                    analisisLexico.setI(analisisLexico.getI()+1);
                    if((lenguaje=",!¡@.[(!#$%&{#])}—'&¿?-+-*/…||~_^\"\\//").indexOf(c)>=0){
                        System.out.println(lenguaje);
                        Act=25;
                        
                    }else
                        if((lenguaje="_").indexOf(c)>=0){
                            Act=10;
                        }else{
                            analisisLexico.setI(analisisLexico.getTokenInicia());
                            return false;
                        }
                break;
                
                
                
                case 10: c=Siguiente(analisisLexico.getI());
                        analisisLexico.setI(analisisLexico.getI()+1);
                        if((lenguaje=":;").indexOf(c)>=0){
                            
                            Act=25;
                        }else
                            if((lenguaje="_").indexOf(c)>=0){
                                Act=25;
                            }else
                                if((lenguaje="0123456789").indexOf(c)>=0){
                                    Act=25;
                                }else
                                    if((lenguaje=" \n\r\t])").indexOf(c)>=0){
                                        Act=25;
                                    }else{
                                        analisisLexico.setI(analisisLexico.getTokenInicia());
                                        return false;
                                    }
                 break;
                
                                    
                                    
                case 25: analisisLexico.setI(analisisLexico.getI());
                return true;
                   
                    
                    
                //Automata emojis
                 case 11: c=Siguiente(analisisLexico.getI());
                    analisisLexico.setI(analisisLexico.getI()+1);
                    if((lenguaje=":;X=<B*(").indexOf(c)>=0){
                        System.out.println(lenguaje+"ASDASDASD");
                        Act=12;
                        
                    }else
                        if((lenguaje=" ").indexOf(c)>=0){
                            Act=8;
                        }else{
                            analisisLexico.setI(analisisLexico.getTokenInicia());
                            return false;
                        }
                break;
                
                
                
                case 12: c=Siguiente(analisisLexico.getI());
                        analisisLexico.setI(analisisLexico.getI()+1);
                        if((lenguaje=":;").indexOf(c)>=0){
                            Act=12;
                        }else
                        if((lenguaje=":;X=<B-'.,").indexOf(c)>=0){
                            Act=12;
                        }else
                        if((lenguaje=")*]DpO3/(_'´|vO*\\//@Pp").indexOf(c)>=0){
                            
                            Act=20;
                            
                        }else
                            if((lenguaje="\"").indexOf(c)>=0){
                                Act=20;
                            }else
                                if((lenguaje="ABCDEFGHIJKLMNOPQRSTUVWXYñÑZabcdefghiíjklmnopqrstuvwxyzáéíóúÁÉÍÓÚ0123456789{&%$#'¿?}~[]").indexOf(c)>=0){
                                    Act=8;
                                }else
                                    if((lenguaje=" \n\r\t").indexOf(c)>=0){
                                        Act=20;
                                    }else{
                                        analisisLexico.setI(analisisLexico.getTokenInicia());
                                        return false;
                                    }
                 break;
                
                                    
                                    
                case 20: analisisLexico.setI(analisisLexico.getI());
                return true;
                   
        
                
                case 21: analisisLexico.setI(analisisLexico.getTokenInicia());
                
                

                
                
                
                //Automata digitos
                case 13 : c=Siguiente(analisisLexico.getI());
                analisisLexico.setI(analisisLexico.getI()+1);
                if((lenguaje="0123456789").indexOf(c)>=0){
                    Act=14;
                }else
                {
                    analisisLexico.setI(analisisLexico.getTokenInicia()); 
                    return false;
                }
                break;
                
                case 14: c=Siguiente(analisisLexico.getI());
                    analisisLexico.setI(analisisLexico.getI()+1);
                        if((lenguaje="0123456789").indexOf(c)>=0){
                             Act=14;
                        }else
                            if((lenguaje=" \n\r\t\"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzáéíóúÁÉÍÓÚ:;)?¡&][{}(").indexOf(c)>=0){
                        Act=15;
                    }else
                        if((lenguaje=".,@#$%&/-_()=!¡?'¿\"\\//||:;+-*/=*~").indexOf(c)>=0){
                            Act=15;
                        }else{
                            analisisLexico.setI(analisisLexico.getTokenInicia());
                            return false;
                        }
                break;
                
                
                case 15: analisisLexico.setI(analisisLexico.getI()-1);
                    return true;
                    
                    
                case 16: c=Siguiente(analisisLexico.getI());
                    analisisLexico.setI(analisisLexico.getI()+1);
                    if((lenguaje="0123456789").indexOf(c)>=0){
                        Act=17;
                        System.out.println(lenguaje);
                    }else{
                        analisisLexico.setI(analisisLexico.getTokenInicia());
                        return false;
                    }
                break;
                
                case 17: c=Siguiente(analisisLexico.getI());
                    analisisLexico.setI(analisisLexico.getI()+1);
                    if((lenguaje="0123456789").indexOf(c)>=0){
                        Act=17;
                    }else
                        if((lenguaje=" \n\r\t.-,\"°![]{}()#$%&//*-+:;<=>áéíóúÁÉÍÓÚ?ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz:").indexOf(c)>=0){
                            Act=15;
                        }else
                            if((lenguaje=".").indexOf(c)>=0){
                                Act=15;
                            }else{
                                analisisLexico.setI(analisisLexico.getTokenInicia());
                                return false;
                            }
                    break;
             
                //Finaliza automata
                case 18: c=Siguiente(analisisLexico.getI());
                         analisisLexico.setI(analisisLexico.getI()+1);
                        if((lenguaje=";").indexOf(c)>=0){
                        Act=22;
                    }else
                    {analisisLexico.setI(analisisLexico.getTokenInicia());
                            return false;}
                    break;
                case 22: return true;
            }
        }
         switch(Act){
             //Espacios
             case 2: 
             //Identificadores
             case 5:
                 //numeros
             case 13:
                    analisisLexico.setI(analisisLexico.getI()-1);
                    return true;
         }
         return false;
    }
    
}
