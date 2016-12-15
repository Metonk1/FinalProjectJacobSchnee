package model;
 
//This is a bit different
//Again think about Strings as well
import java.util.ArrayList;

//From Project I, Insert, find, delete and update
public class AnimeBag {
	
	private ArrayList<Anime> animeList;

	public AnimeBag() {
		this.animeList = animeList;
	}
	
	public void addAnime(Anime anime){
		animeList.add(anime);
		
	}
	
	public void display(){
		for(Anime anime: animeList){
			System.out.println(anime);
		}
	}
	
	//Search by name
		public Anime findAnime(String name, AnimeBag data){
			for(Anime anime: data.getAnimeList()){
				if(anime.getAnimeName().equalsIgnoreCase((name))){
					return anime;
				}
			}
			System.out.println("Not found");
			return null;


		}
		//Delete by Id
		public boolean deleteAnime(String name, AnimeBag data){
			for(Anime anime: data.getAnimeList()){
				if(anime.getAnimeName().equalsIgnoreCase(name)){
					animeList.remove(anime);
					return true;
				}
			}
			return false;
			
			
			

}

		public ArrayList<Anime> getAnimeList() {
			return animeList;
		}

		public void setAnimeList(ArrayList<Anime> animeList) {
			this.animeList = animeList;
		}
}
		
		
		
