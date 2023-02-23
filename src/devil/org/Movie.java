package devil.org;
import java.util.*;


public class Movie {
	
		String Movie_Name;
		String Actor_Name;
		int Year;
		public Movie(String Movie_Name,String Actor_Name,int Year) {
			this.Movie_Name = Movie_Name;
			this.Actor_Name = Actor_Name;
			this.Year = Year;
		}
			
			@Override
			public String toString() {
				return "Movie [Movie_Name=" + Movie_Name + ", Actor_Name=" + Actor_Name + ", Year=" + Year + "]";
			
			}
		
		public static void main(String[] args) {
		List<Movie>Movie = Arrays.asList(new Movie("Transformer","Optimus Prime",2007)
				,new Movie("Transformer 2","Bumblebee",2012),
				new Movie("Transformer 3","Iron Head",2015));
		for(int i = 0;i < Movie.size();i++) {
		System.out.println(Movie.get(i).toString());

		
		}
		
	}
		

}


