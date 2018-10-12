package com.sudheer;
import java.util.List;
/*
import com.mongodb.DB;
import com.mongodb.MongoClient;
public class mongodb{
	public String mongo(){ 
		String ask=null;
		try{ 
		MongoClient mongo = new MongoClient( "mongodb://$OPENSHIFT_MONGODB_DB_HOST:$OPENSHIFT_MONGODB_DB_PORT/" , 27017 );
		MongoClient mongoClient = new MongoClient();
		DB db = mongoClient.getDB("demoproject");
		boolean auth = db.authenticate("admin", "d49kFknd4uSG".toCharArray());
		List<String> dbs = mongo.getDatabaseNames();
		for(String db1 : dbs){
			System.out.println(db1);
			ask+=db1;
		}
		}
		catch(Exception e){
		}
		return ask;//  mongodb://$OPENSHIFT_MONGODB_DB_HOST:$OPENSHIFT_MONGODB_DB_PORT/
		}
	}

/*
 Gears:          Located with jbossas-7
      Connection URL: mongodb://$OPENSHIFT_MONGODB_DB_HOST:$OPENSHIFT_MONGODB_DB_PORT/
      Database Name:  demoproject
      Password:       d49kFknd4uSG
      Username:       admin
*/