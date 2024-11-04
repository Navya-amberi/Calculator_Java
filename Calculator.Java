import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Main {
    public static void main(String[] args){  
        JFrame f=new JFrame();
          
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

        JTextField t1;    
        t1 = new JTextField("");    
        t1.setBounds(20,10, 330,50);    
        f.add(t1);

        JButton b0 =new JButton("0");
        b0.setBounds(20,100,50, 40);     
        f.add(b0);

        JButton b1 =new JButton("1");
        b1.setBounds(100,100,50, 40);     
        f.add(b1);

        JButton b2 =new JButton("2");
        b2.setBounds(180,100,50, 40);     
        f.add(b2);

        JButton bAdd =new JButton("+");
        bAdd.setBounds(250,100,100, 40);     
        f.add(bAdd);

        JButton b3 =new JButton("3");
        b3.setBounds(20,160,50, 40);     
        f.add(b3);


        JButton b4 =new JButton("4");
        b4.setBounds(100,160,50, 40);     
        f.add(b4);

        JButton b5 =new JButton("5");
        b5.setBounds(180,160,50, 40);     
        f.add(b5);

        JButton bSub =new JButton("-");
        bSub.setBounds(250,160,100, 40);     
        f.add(bSub);

        JButton b6 =new JButton("6");
        b6.setBounds(20,220,50, 40);     
        f.add(b6);


        JButton b7 =new JButton("7");
        b7.setBounds(100,220,50, 40);     
        f.add(b7);

        JButton b8 =new JButton("8");
        b8.setBounds(180,220,50, 40);     
        f.add(b8);

        JButton bMul =new JButton("X");
        bMul.setBounds(250,220,100, 40);     
        f.add(bMul);

        //JButton bOpenP =new JButton("(");
        //bOpenP.setBounds(20,280,50, 40);     
        //f.add(bOpenP);

        JButton bBack =new JButton("<-");
        bBack.setBounds(20,280,50, 40);     
        f.add(bBack);

        JButton b9 =new JButton("9");
        b9.setBounds(100,280,50, 40);     
        f.add(b9);
        
        //JButton bClosedP =new JButton(")");
        //bClosedP.setBounds(180,280,50, 40);     
        //f.add(bClosedP);

        JButton bDiv =new JButton("/");
        bDiv.setBounds(180,280,50, 40);     
        f.add(bDiv);

        JButton bEqual =new JButton("=");
        bEqual.setBounds(250,280,100, 40);     
        f.add(bEqual);


        b0.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
                t1.setText(t1.getText().toString() + "0"); 
                System.out.println(t1.getText().toString()); 
            }  
        }); 

        b1.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                t1.setText(t1.getText().toString() + "1");  
            }  
        });

        b2.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                t1.setText(t1.getText().toString() + "2");
                System.out.println(t1.getText().toString());  
            }  
        });

        b3.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                t1.setText(t1.getText().toString() + "3");  
                System.out.println(t1.getText().toString());
            }  
        });

        b4.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                t1.setText(t1.getText().toString() + "4");  
            }  
        });

        b5.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                t1.setText(t1.getText().toString() + "5");  
            }  
        });

        b6.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                t1.setText(t1.getText().toString() + "6");  
            }  
        });

        b7.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                t1.setText(t1.getText().toString() + "7");  
            }  
        });

        b8.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                t1.setText(t1.getText().toString() + "8");  
            }  
        });

        b9.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                t1.setText(t1.getText().toString() + "9");  
            }  
        });

        bAdd.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                t1.setText(t1.getText().toString() + "+");  
            }  
        });

        bSub.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                t1.setText(t1.getText().toString() + "-");  
            }  
        });

        bMul.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                t1.setText(t1.getText().toString() + "*");  
            }  
        });

        bDiv.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                t1.setText(t1.getText().toString() + "/");  
            }  
        });

        bBack.addActionListener(new ActionListener(){  
          public void actionPerformed(ActionEvent e){
                String expr = t1.getText().toString();
                t1.setText(expr.substring(0, expr.length()-1));
            }  
        });

        bEqual.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e) {  

                try{
                    ScriptEngineManager manager = new ScriptEngineManager();
                    ScriptEngine engine = manager.getEngineByName("js");
                    Object result = engine.eval(t1.getText().toString());
                    System.out.println(result);
                    t1.setText(result.toString());

                }
                catch( ScriptException ioe){
                    ioe.printStackTrace();

                }
                catch(NullPointerException ioe){
                    ioe.printStackTrace();
                }
            }  
        });
    } 
}  
