package Assignment;

import java.util.Comparator;

public class CheckComparator implements Comparator<Cutomer>{
			@Override
			public int compare(Cutomer o1, Cutomer o2) {
				
				if(o1.getName().equals(o2.getName()))
				{
					int Ager=o1.getAge().compareTo(o2.getAge());
					return Ager;
				}
				int namer=o1.getName().compareTo(o2.getName());
				return namer; 
			}

		}

