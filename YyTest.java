public class YyTest{
	public String inter(int[] s1,int[] s2){
		int x11 = s1[0], x12 = s1[2], x21 = s2[0], x22 = s2[2];
		int y11 = s1[1], y12 = s1[3], y21 = s2[1], y22 = s2[3];
		if(x11 == x12){  //line 1 平行于Y轴
			if(x21 == x22){   // line2 平行于Y轴
				if( x11 == x21){ //line1 line2 处于同一垂直线
					if(y21 ==  y12 || y11 == y22){ // line1 line2 相交于一点
						return "point1";
					}else if( y12 > y21 || y22 > y11){ //line1 line2 不相交
						return "NO";
					}else {return "signment1";}
				}else {return "NO2";}
			}else{
				if(y21 > y11 || y21 <y12 || x11 > x21 || x11 < x22){//line1 line2 不相交 
					return "NO4";
					}
					else return "point3";
			}
		}else if(y21 == y22){ //line2平行于X轴
				if(y11 == y21){ //line1 line2处于同一水平线上
					if( x11 == x22 || x21 == x12){ //line1 line2相交于一点
						return "point2";
					}else if( x12 > x21 || x22 >x11){ //line1 line2 不相交
						return "NO3";
					}else return "signment2";
				}else return "NO@";
		}else{
			if(x21 > x11 || x21 < x12 || y11>y21 || y11 < y22){ //line1 line2 不相交
				return "NO5";
			}
				else return "point4";
		}
	}



	public static void main(String[] args){
		YyTest test = new YyTest();
		int[] s1 = {1,0,0,0};
		int[] s2 = {3,0,0,0};
		System.out.println(test.inter(s1,s2));
	}
}
