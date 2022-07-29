package mongodb;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import com.mongodb.MongoClient;
public class InsertingDocument {
	public static void main( String args[] ) {
	
	// Creating a Mongo client
	MongoClient mongo = new MongoClient("13.52.182.125" , 27017 );
	
	// Accessing the database
	MongoDatabase database = mongo.getDatabase("myDb");
	
	// Creating a collection
	database.createCollection("sampleCollection1");
	System.out.println("Collection created successfully");
	
	// Retrieving a collection
	MongoCollection<Document> collection = database.getCollection("sampleCollection1");
	System.out.println("Collection sampleCollection1 selected successfully");
	Document document = new Document("title", "MongoDB")
	.append("description", "database")
	.append("likes", 100)
	.append("url", "http://www.mongodb.com/mongodb/")
	.append("by", "tutorials point");
	
	//Inserting document into the collection
	collection.insertOne(document);
	System.out.println("Document inserted successfully");
	}
}