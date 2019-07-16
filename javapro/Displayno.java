class Displayno
{
 public static void main(String args[])
 {
   int a,a1,a2,a3,a4;
     a=(int)(Math.random()*10000);
     a1=a/1000;a=a-a1*1000;
     a2=a/100;a=a-a2*100;
      a3=a/10;a4=a-a3*10;
if(a1!=0)
{      
switch(a1)
     {
      case 1:System.out.print(" One ");break;
      case 2:System.out.print(" Two ");break;
      case 3:System.out.print(" Three ");break;
      case 4:System.out.print(" Four ");break;
      case 5:System.out.print(" Five ");break;
      case 6:System.out.print(" Six ");break;
      case 7:System.out.print(" Seven ");break;
      case 8:System.out.print(" Eight ");break;
      case 9:System.out.print(" Nine ");break;
      case 0:System.out.print(" zero ");
     }
System.out.print("Thousand");
}
       if(a2!=0)
{
 switch(a2)
     {
      case 1:System.out.print(" One ");break;
      case 2:System.out.print(" Two ");break;
      case 3:System.out.print(" Three ");break;
      case 4:System.out.print(" Four ");break;
      case 5:System.out.print(" Five ");break;
      case 6:System.out.print(" Six ");break;
      case 7:System.out.print(" Seven ");break;
      case 8:System.out.print(" Eight ");break;
      case 9:System.out.print(" Nine ");break;
      case 0:System.out.print(" zero ");
     }
System.out.print("Hundred");
}
switch(a3)
     {
      case 0:
                switch(a4){case 1:System.out.print(" One ");break;
                                 case 2:System.out.print(" Two ");break;
      		case 3:System.out.print(" Three ");break;
     		 case 4:System.out.print(" Four ");break;
    	  	case 5:System.out.print(" Five ");break;
      		case 6:System.out.print(" Six ");break;
      		case 7:System.out.print(" Seven ");break;
     	 	case 8:System.out.print(" Eight ");break;
      		case 9:System.out.print(" Nine ");break;
    		 }break;
        case 1:
                 switch(a4){case 0:System.out.print(" Ten ");break;
                                  case 1:System.out.print(" Eleven ");break;
      		case 2:System.out.print(" Tweleve ");break;
     		 case 3:System.out.print(" Thirteen ");break;
    	  	case 4:System.out.print(" Fourteen ");break;
      		case 5:System.out.print(" Fifteen");break;
      		case 6:System.out.print(" Sixteen ");break;
     	 	case 7:System.out.print(" Seventeen  ");break;
      		case 8:System.out.print(" Eighteen");break;
                                  case 9:System.out.print(" Nineteen ");break;
    	                 }break;
case 2:System.out.print(" Twenty ");break;
case 3:System.out.print(" Thirty ");break;
case 4:System.out.print(" Fourty ");break;
case 5:System.out.print(" Fifty ");break;
case 6:System.out.print(" Sixty ");break;
case 7:System.out.print(" Seventy ");break;
case 8:System.out.print(" Eighty ");break;
case 9:System.out.print(" Ninety ");break;
         }
switch(a4)
     {
      case 1:System.out.print(" One ");break;
      case 2:System.out.print(" Two ");break;
      case 3:System.out.print(" Three ");break;
      case 4:System.out.print(" Four ");break;
      case 5:System.out.print(" Five ");break;
      case 6:System.out.print(" Six ");break;
      case 7:System.out.print(" Seven ");break;
      case 8:System.out.print(" Eight ");break;
      case 9:System.out.print(" Nine ");break;
      case 0:System.out.print(" zero ");
     }
}
}