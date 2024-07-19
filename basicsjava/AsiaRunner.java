class AsiaRunner{
public static void main(String[] args)
{
		String[] state={"Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", 
		"Chhattisgarh","Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jharkhand",
		"Karnataka","Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", 
		"Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu",
		"Telangana", "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal", "Ladakh"};
		Asia.statesOfIndia(state);
		System.out.println("statesOfIndia");
		
		int[] pincodes={586128, 586102, 586103, 586101, 586001,
            403001, 380001, 586121, 171001, 834001};
		Asia.pincodesOfStates(pincodes);
		System.out.println("pincodesOfStates");
		
		
		String[] primeMinisters={"Jawaharlal Nehru","Gulzarilal Nanda","Lal Bahadur Shastri","Indira Gandhi","Morarji Desai",
								"Charan Singh","Rajiv Gandhi","Vishwanath Pratap Singh","Chandra Shekhar","P. V. Narasimha Rao",
								"Atal Bihari Vajpayee","H. D. Deve Gowda","I. K. Gujral","Manmohan Singh","Narendra Modi"};
		Asia.primeMinistersOfIndia(primeMinisters);	
		System.out.println("primeMinistersOfIndia");
		
		
		
		String[] cabinateMinistersList={"Jawaharlal Nehru", "Lal Bahadur Shastri", "Indira Gandhi", "Rajiv Gandhi", 
		"P. V. Narasimha Rao", "Atal Bihari Vajpayee", "Manmohan Singh", "Narendra Modi", "Amit Shah", "Nirmala Sitharaman",
		"Rajnath Singh", "S. Jaishankar", "Arjun Munda", "Dharmendra Pradhan", "Mansukh Mandaviya", "Piyush Goyal", "Narendra Singh Tomar", 
		"Nitin Gadkari", "Giriraj Singh", "Jyotiraditya Scindia", "Raj Kumar Singh", "Anurag Thakur", "Smriti Irani", "Pralhad Joshi",
		"Kiren Rijiju", "Hardeep Singh Puri", "Jitendra Singh", "Sanjay Kumar Jaiswal", "Babul Supriyo", "Ravi Shankar Prasad"};
		Asia.cabinateMinistersOfIndia(cabinateMinistersList);
		System.out.println("cabinateMinistersOfIndia");
		
		
		
		String[] politicalPartiesList={"Bharatiya Janata Party ", "Indian National Congress ", 
		"Communist Party of India", "Aam Aadmi Party ", "Nationalist Congress Party "};
		Asia.politicalPartiesOfIndia(politicalPartiesList);

		
	}
}