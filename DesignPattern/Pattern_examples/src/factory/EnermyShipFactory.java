package factory;

public class EnermyShipFactory {
	public EnermyShip makeEnermyShip(String type){		         
		if (type.equals("U")){		             
			return new UFOEnermyShip();      
		}else if (type.equals("R")){		             
			return new RocketEnermyShip();      
		}else if (type.equals("BU")){		             
			return new BigUFOEnermyShip();      
		}else 
			return null;
	}
}
