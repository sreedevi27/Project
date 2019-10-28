package com.User.Demo;
	
	public class Dto {
	   
	
		private String statename;
	    private String id;
		public String getStatename() {
			return statename;
		}
		public void setStatename(String statename) {
			this.statename = statename;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public Dto(String statename, String id) {
			
			this.statename = statename;
			this.id = id;
		}
		
	   

	}



