public class Admin1 {
	
		String strMovieID, strMovieName, strStars, strStartDate, strEndDate, strSlot912,
		 strSlot1215, strSlot1518, strSlot1821, strPlatinumPrice, strGoldPrice, strSilverPrice,strImageName ;
		public Admin1()
		
		{
			
		}

		public String toString() 
		{
			return "Admin1[strMovieID="+strMovieID+" ,strMovieName="+strMovieName+" ,strStars="+strStars+" ,strStartDate="+strStartDate+" ,strEndDate="+strEndDate+",strSlot912="+strSlot912+",strSlot1215="+strSlot1215+",strSlot1518="+strSlot1518+",strSlot1821="+strSlot1821+",strPlatinumPrice="+strPlatinumPrice+",strGoldPrice="+strGoldPrice+",GoldPricestrSilverPrice="+strSilverPrice+",strImageName="+strImageName+" ]";
		}
		
		public Admin1(String strMovieID,String strMovieName,String strStars,String strStartDate,String strEndDate,String strSlot912,String strSlot1215,String strSlot1518,String strSlot1821,String strPlatinumPrice,String strGoldPrice,String strSilverPrice,String strImageName)

		{
			super();
			this.strMovieID=strMovieID;
			this.strMovieName=strMovieName;
			this.strStars=strStars;
			this.strStartDate=strStartDate;
			this.strEndDate=strEndDate;
			this.strSlot912=strSlot912;
			this.strSlot1215=strSlot1215;
			this.strSlot1518=strSlot1518;
			this.strSlot1821=strSlot1821;
			this.strPlatinumPrice=strPlatinumPrice;
			this.strGoldPrice=strGoldPrice;
			this.strSilverPrice=strSilverPrice;
			this.strImageName=strImageName;
			
		}
		public String getstrMovieID()
		{
			return strMovieID;
			
		}
		public void setstrMovieID(String strMovieID)
		{
			this.strMovieID=strMovieID;
		}

		public String getstrMovieName() {
			// TODO Auto-generated method stub
			return this.strMovieName;
		}


		public String getStrStars() {
			return strStars;
		}

		public void setStrStars(String strStars) {
			this.strStars = strStars;
		}

		public String getStrStartDate() {
			return strStartDate;
		}

		public void setStrStartDate(String strStartDate) {
			this.strStartDate = strStartDate;
		}

		public String getStrEndDate() {
			return strEndDate;
		}

		public void setStrEndDate(String strEndDate) {
			this.strEndDate = strEndDate;
		}

		public String getStrSlot912() {
			return strSlot912;
		}

		public void setStrSlot912(String strSlot912) {
			this.strSlot912 = strSlot912;
		}
		public String getStrSlot1215() {
			return strSlot1215;
		}

		public void setStrSlot1215(String strSlot1215) {
			this.strSlot1215 = strSlot1215;
		}
		public String getStrSlot1518() {
			return strSlot1518;
		}

		public void setStrSlot1518(String strSlot1518) {
			this.strSlot1518 = strSlot1518;
		}

		public String getStrSlot1821() {
			return strSlot1821;
		}

		public void setStrSlot1821(String strSlot1821) {
			this.strSlot1821 = strSlot1821;
		}

		public String getStrPlatinumPrice() {
			return strPlatinumPrice;
		}

		public void setStrPlatinumPrice() {
			this.strPlatinumPrice = strPlatinumPrice;
		}

		public String getStrGoldPrice() {
			return strGoldPrice;
		}

		public void setStrGoldPrice(String strGoldPrice) {
			this.strGoldPrice= strGoldPrice;
		}

		public String getStrSilverPrice() {
			return strSilverPrice;
		}

		public void setStrSilverPrice(String strSilverPrice) {
			this.strSilverPrice = strSilverPrice;
		}

		public String getStrImageName() {
			//return strImageName;
			return this.strImageName;
		}

}
	
