import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class Main implements ActionListener{
	
boolean OperatorClicked=false;
String Oldvalue;
String Newvalue;
int First=1, OperatorValue, OperatorValue2;
double result=0, memory=0, n1=0, num;
JFrame Frame;
JLabel Screen;
JButton Seven;
JButton Eight;
JButton Nine;
JButton Four;
JButton Five;
JButton Six;
JButton One;
JButton Two;
JButton Three;
JButton Zero;
JButton Point;
JButton CE, C;
JButton Arrow;
JButton Plusorminus, Percentage, Square;
JButton MR, MC, MRC, MPlus;
JButton Plus, Minus, Multiply, Divide, Equal;
Main(){
	

Frame=new JFrame("Calculator");
Frame.setLayout(null);
Frame.setBounds(380, 90, 500, 600);
Frame.setBackground(Color.darkGray);
Frame.setOpacity(1);
Frame.setVisible(true);
Frame.setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);

Screen=new JLabel(" ");
Screen.setBounds(30, 30, 425, 80);
Screen.setBackground(Color.GRAY);
Screen.setOpaque(true);
Screen.setFont(new Font("SERIF", Font.BOLD, 45));
Screen.setForeground(Color.BLACK);
Screen.setHorizontalAlignment(SwingConstants.RIGHT);
Frame.add(Screen);

JLabel Logo=new JLabel("C A S I O");
Logo.setBounds(55, 110, 100, 85);
Logo.setFont(new Font("Serif", Font.BOLD, 20));
Frame.add(Logo);

Plusorminus=new JButton("+/-");
Plusorminus.setBounds(400, 140, 55, 30);
Plusorminus.setFont(new Font("Arial", Font.PLAIN, 10));
Plusorminus.setBackground(Color.LIGHT_GRAY);
Plusorminus.setOpaque(true);
Plusorminus.addActionListener(this);
Frame.add(Plusorminus);
	
Arrow=new JButton(">");
Arrow.setBounds(330, 140, 55, 30);
Arrow.setFont(new Font("Arial", Font.BOLD, 14));
Arrow.setBackground(Color.LIGHT_GRAY);
Arrow.setOpaque(true);
Arrow.addActionListener(this);
Frame.add(Arrow);

MC=new JButton("MC");
MC.setBounds(30, 190, 65,45);
MC.setFont(new Font("Arial", Font.BOLD, 14));
MC.setBackground(Color.LIGHT_GRAY);
MC.setOpaque(true);
MC.addActionListener(this);
Frame.add(MC);

MRC=new JButton("MRC");
MRC.setBounds(120, 190, 65,45);
MRC.setFont(new Font("Arial", Font.BOLD, 12));
MRC.setBackground(Color.LIGHT_GRAY);
MRC.setOpaque(true);
MRC.addActionListener(this);
Frame.add(MRC);

MPlus=new JButton("M+");
MPlus.setBounds(210, 190, 65,45);
MPlus.setFont(new Font("Arial", Font.BOLD, 14));
MPlus.setBackground(Color.LIGHT_GRAY);
MPlus.setOpaque(true);
MPlus.addActionListener(this);
Frame.add(MPlus);

MR=new JButton("MR");
MR.setBounds(300, 190, 65,45);
MR.setFont(new Font("Arial", Font.BOLD, 14));
MR.setBackground(Color.LIGHT_GRAY);
MR.setOpaque(true);
MR.addActionListener(this);
Frame.add(MR);

Divide=new JButton("/");
Divide.setBounds(390, 190, 65,45);
Divide.setFont(new Font("Arial", Font.BOLD, 14));
Divide.setBackground(Color.LIGHT_GRAY);
Divide.setOpaque(true);
Divide.addActionListener(this);
Frame.add(Divide);

Percentage=new JButton("%");
Percentage.setBounds(30, 255, 65,45);
Percentage.setFont(new Font("Arial", Font.BOLD, 14));
Percentage.setBackground(Color.LIGHT_GRAY);
Percentage.setOpaque(true);
Percentage.addActionListener(this);
Frame.add(Percentage);

Seven=new JButton("7");
Seven.setBounds(120, 255, 65,45);
Seven.setFont(new Font("Arial", Font.BOLD, 16));
Seven.setBackground(Color.WHITE);
Seven.setOpaque(true);
Seven.addActionListener(this);
Frame.add(Seven);

Eight=new JButton("8");
Eight.setBounds(210, 255, 65,45);
Eight.setFont(new Font("Arial", Font.BOLD, 16));
Eight.setBackground(Color.WHITE);
Eight.setOpaque(true);
Eight.addActionListener(this);
Frame.add(Eight);

Nine=new JButton("9");
Nine.setBounds(300, 255, 65,45);
Nine.setFont(new Font("Arial", Font.BOLD, 16));
Nine.setBackground(Color.WHITE);
Nine.setOpaque(true);
Nine.addActionListener(this);
Frame.add(Nine);

Multiply=new JButton("x");
Multiply.setBounds(390, 255, 65,45);
Multiply.setFont(new Font("Arial", Font.BOLD, 16));
Multiply.setBackground(Color.lightGray);
Multiply.setOpaque(true);
Multiply.addActionListener(this);
Frame.add(Multiply);

Square=new JButton("Sqr");
Square.setBounds(30, 320, 65,45);
Square.setFont(new Font("Arial", Font.BOLD, 14));
Square.setBackground(Color.LIGHT_GRAY);
Square.setOpaque(true);
Square.addActionListener(this);
Frame.add(Square);

Four=new JButton("4");
Four.setBounds(120, 320, 65,45);
Four.setFont(new Font("Arial", Font.BOLD, 16));
Four.setBackground(Color.WHITE);
Four.setOpaque(true);
Four.addActionListener(this);
Frame.add(Four);

Five=new JButton("5");
Five.setBounds(210, 320, 65,45);
Five.setFont(new Font("Arial", Font.BOLD, 16));
Five.setBackground(Color.WHITE);
Five.setOpaque(true);
Five.addActionListener(this);
Frame.add(Five);


Six=new JButton("6");
Six.setBounds(300, 320, 65,45);
Six.setFont(new Font("Arial", Font.BOLD, 16));
Six.setBackground(Color.WHITE);
Six.setOpaque(true);
Six.addActionListener(this);
Frame.add(Six);

Minus=new JButton("-");
Minus.setBounds(390, 320, 65,45);
Minus.setFont(new Font("Arial", Font.BOLD, 16));
Minus.setBackground(Color.LIGHT_GRAY);
Minus.setOpaque(true);
Minus.addActionListener(this);
Frame.add(Minus);

CE=new JButton("CE");
CE.setBounds(30, 385, 65,45);
CE.setFont(new Font("Arial", Font.BOLD, 14));
CE.setBackground(Color.red);
CE.setOpaque(true);
CE.addActionListener(this);
Frame.add(CE);

One=new JButton("1");
One.setBounds(120, 385, 65,45);
One.setFont(new Font("Arial", Font.BOLD, 16));
One.setBackground(Color.WHITE);
One.setOpaque(true);
One.addActionListener(this);
Frame.add(One);

Two=new JButton("2");
Two.setBounds(210, 385, 65,45);
Two.setFont(new Font("Arial", Font.BOLD, 16));
Two.setBackground(Color.WHITE);
Two.setOpaque(true);
Two.addActionListener(this);
Frame.add(Two);

Three=new JButton("3");
Three.setBounds(300, 385, 65,45);
Three.setFont(new Font("Arial", Font.BOLD, 16));
Three.setBackground(Color.WHITE);
Three.setOpaque(true);
Three.addActionListener(this);
Frame.add(Three);

Plus=new JButton("+");
Plus.setBounds(390, 385, 65,110);
Plus.setFont(new Font("Arial", Font.BOLD, 16));
Plus.setBackground(Color.LIGHT_GRAY);
Plus.setOpaque(true);
Plus.addActionListener(this);
Frame.add(Plus);

C=new JButton("C");
C.setBounds(30, 450, 65,45);
C.setFont(new Font("Arial", Font.BOLD, 14));
C.setBackground(Color.red);
C.setOpaque(true);
C.addActionListener(this);
Frame.add(C);

Zero=new JButton("0");
Zero.setBounds(120, 450, 65,45);
Zero.setFont(new Font("Arial", Font.BOLD, 16));
Zero.setBackground(Color.WHITE);
Zero.setOpaque(true);
Zero.addActionListener(this);
Frame.add(Zero);

Point=new JButton(".");
Point.setBounds(210, 450, 65,45);
Point.setFont(new Font("Arial", Font.BOLD, 16));
Point.setBackground(Color.WHITE);
Point.setOpaque(true);
Point.addActionListener(this);
Frame.add(Point);

Equal=new JButton("=");
Equal.setBounds(300, 450, 65,45);
Equal.setFont(new Font("Arial", Font.BOLD, 16));
Equal.setBackground(Color.WHITE);
Equal.setOpaque(true);
Equal.addActionListener(this);
Frame.add(Equal);

}
public static void main(String[] args) {
Main Calculator=new Main();

}

@Override
public void actionPerformed(ActionEvent e) {	
  if (e.getSource()==Seven) {
	  if (OperatorClicked==true) {
		  Screen.setText("7");
		  OperatorClicked=false;
	  } else { 
		  Screen.setText(Screen.getText()+"7");
	  }
} else if (e.getSource()==Eight) {
	  if (OperatorClicked ==true) {
		  Screen.setText("8");
		  OperatorClicked=false;
	  } else { 
		  Screen.setText(Screen.getText()+"8");
	  }
} else if (e.getSource()==Nine) {
		if(OperatorClicked ==true) {
		   Screen.setText("9");
		   OperatorClicked=false;
	  } else {
		  Screen.setText(Screen.getText()+"9");
	  }	
} else if (e.getSource()==Four) {
	    if(OperatorClicked ==true) {
		   Screen.setText("4");
		   OperatorClicked=false;
	  } else {
		  Screen.setText(Screen.getText()+"4");
	  }
} else if (e.getSource()==Five) {
	    if (OperatorClicked==true) {
	    	Screen.setText("5");
	    	OperatorClicked=false;
	  } else {
		  Screen.setText(Screen.getText()+"5");
	  }
} else if (e.getSource()==Six) {
		if (OperatorClicked==true) {
			Screen.setText("6");
			OperatorClicked=false;
	  } else {
		  Screen.setText(Screen.getText()+"6");
	  }	
} else if (e.getSource()==One) {
		if (OperatorClicked==true) {
			Screen.setText("1");
			OperatorClicked=false;
	  } else {
	      Screen.setText(Screen.getText()+"1");
      }	
} else if (e.getSource()==Two) {
		if (OperatorClicked==true) {
			Screen.setText("2");
			OperatorClicked=false;
	  } else {
		  
	  }   Screen.setText(Screen.getText()+"2");
} else if (e.getSource()==Three) {
		if (OperatorClicked==true) {
			Screen.setText("3");
			OperatorClicked=false;
		} else {
			Screen.setText(Screen.getText()+"3");
		}
} else if (e.getSource()==Zero) {
		if (OperatorClicked==true) {
			Screen.setText("0");
			OperatorClicked=false;
		} else {
			Screen.setText(Screen.getText()+"0");
		}
} else if (e.getSource()==Point) {
		if (OperatorClicked==true) {
			Screen.setText(".");
			OperatorClicked=false;
		} else {
			Screen.setText(Screen.getText()+".");
		}
}  else if (e.getSource()==Plus) {
	OperatorClicked=true;
	if (First==1) {
		result=num=Double.parseDouble(Screen.getText());
		OperatorValue=1;
	} else {
		n1=Double.parseDouble(Screen.getText());
		OperatorValue2=1;
	}  
	
	switch(OperatorValue) {
	case 1: 
		Add();
		break;
	case 2:
		Sub();
		break;
	case 3:
		Multi();
		break;
	case 4:
		div();
		break;
		}
	
} else if (e.getSource()==Minus) {
	OperatorClicked=true;
	if (First==1) {
		result=num=Double.parseDouble(Screen.getText());
		OperatorValue=2;
	} else {
		n1=Double.parseDouble(Screen.getText());
		OperatorValue2=2;
	}  
	
	switch(OperatorValue) {
	case 1: 
		Add();
		break;
	case 2:
		Sub();
		break;
	case 3:
		Multi();
		break;
	case 4:
		div();
		break;
		}
	
} else if (e.getSource()==Divide) {
	OperatorClicked=true;
	if (First==1) {
		result=num=Double.parseDouble(Screen.getText());
		OperatorValue=4;
	} else {
		n1=Double.parseDouble(Screen.getText());
		OperatorValue2=4;
	}  
	
	switch(OperatorValue) {
	case 1: 
		Add();
		break;
	case 2:
		Sub();
		break;
	case 3:
		Multi();
		break;
	case 4:
		div();
		break;
		}

} else if (e.getSource()==Multiply) {
	OperatorClicked=true;
	if (First==1) {
		result=num=Double.parseDouble(Screen.getText());
		OperatorValue=3;
	} else {
		n1=Double.parseDouble(Screen.getText());
		OperatorValue2=3;
	}  
	
	switch(OperatorValue) {
	case 1: 
		Add();
		break;
	case 2:
		Sub();
		break;
	case 3:
		Multi();
		break;
	case 4:
		div();
		break;
		}

} else if (e.getSource()==Equal) {
	double n1=Double.parseDouble(Screen.getText());
	if (OperatorValue==1) {
		result=result+n1; 
	} else if (OperatorValue==2) {
		result=result-n1;
	} else if (OperatorValue==3) {
		result=result*n1;
	} else if (OperatorValue==4) {
		result=result/n1;
	} else {
		result=Double.parseDouble(Screen.getText());
	}num=result;
	Screen.setText(result+"");
	OperatorClicked=true;

	
} else if (e.getSource()==Arrow) {
	int len;
	String str;
	str=Screen.getText();
	len=str.length();
	if (len>=1) {
		str=str.substring(0,len-1);
		Screen.setText(str);
	}
} else if (e.getSource()==CE) {
	result=0;
	First=1;
	String Str;
	Str=String.valueOf("");
	Screen.setText(Str);
	
} else if (e.getSource()==Plusorminus) {
	double n1=Double.parseDouble(Screen.getText());
	n1=-n1;
	String Str;
	Str=String.valueOf(n1);
	Screen.setText(Str);
} else if (e.getSource()==MRC) {
	memory=Double.parseDouble(Screen.getText());
	
} else if (e.getSource()==MR) {
	Screen.setText(memory+"");
} else if (e.getSource()==MPlus) {
	memory=memory+Double.parseDouble(Screen.getText());
} else if (e.getSource()==MC) {
	memory=0;
	Screen.setText("");
} else if (e.getSource()==Percentage) {
	double n1=Double.parseDouble(Screen.getText());
	n1=(n1*num)/100;
	String Str;
	Str=String.valueOf(n1);
	Screen.setText(Str);
} else if (e.getSource()==Square) {
	double n1=Double.parseDouble(Screen.getText());
	n1=Math.sqrt(n1);
	String Str;
	Str=String.valueOf(n1);
	Screen.setText(Str);
} else if (e.getSource()==C){
	result=0;
	memory=0;
	String Str;
	Str=String.valueOf("");
	Screen.setText(Str);
}	

	
	
	
  
}



void Add() {
	if (First==0) {
		result=num=result+n1;
		Screen.setText(result+"");
		n1=0;
	} 
	if (OperatorValue2!=0) {
		OperatorValue=OperatorValue2;
		OperatorValue2=0;
	}else {
		First=0;
	}
}

void Sub() {
	if (First==0) {
		result=num=result-n1;
		Screen.setText(result+"");
	} 
	if (OperatorValue2!=0) {
		OperatorValue=OperatorValue2;
		OperatorValue2=0;
	}else {
		First=0;
	}
}
void Multi() {
	if (First==0) {
		result=num=result*n1;
		Screen.setText(result+"");
	}if (OperatorValue2!=0) {
		OperatorValue=OperatorValue2;
		OperatorValue2=0;
	}else {
		First=0;
	}
}

void div() {
	if (First==0) {
		result=num=result/n1;
		Screen.setText(result+"");
	}if (OperatorValue2!=0) {
		OperatorValue=OperatorValue2;
		OperatorValue2=0;
	} else {
		First=0;
	}
}

}





