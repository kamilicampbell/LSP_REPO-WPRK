package org.howard.edu.lsp.assignment2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;

public class ETLPipeline {

	public static void main(String[] args) {
		String inputFile = "data/products.csv";
        String outputFile = "data/transformed_products.csv";
        
        try {
            List<String> allLines = Files.readAllLines(Paths.get(inputFile));
            List<String> lines = new ArrayList<>();
            lines.add("ProductID,Name,Price,Category,PriceRange");
            
            for (int i = 1; i < allLines.size(); i++) {
                String[] fields = allLines.get(i).split(",");
                lines.add(transform(fields));
            }
		// TODO Auto-generated method stub
	}

}
