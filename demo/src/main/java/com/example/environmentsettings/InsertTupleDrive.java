package com.example.environmentsettings;

import com.example.DBConnection;

public class InsertTupleDrive {
	
	private InsertTuple driver;
	private DBConnection DBC;
	
	public InsertTupleDrive(DBConnection DBConnection) {
		this.DBC = DBConnection;
		driver = new InsertTuple(DBC);
		
	}
	
	public void InsertTupleAll() {
		// 반드시 이 순서대로 insert해야함
		// Foreign key에 유의해서 만들어야한다...
		InsertCustomerInfo();
		InsertCustomerAddress();
		InsertCustomerOrganization();
		InsertPayment();
		InsertArea();
		InsertWorker();
		InsertSalaryLog();
		InsertNation();
		InsertDriverLicense();
		InsertUnitMeasureSize();
		InsertVehicle();
		InsertDriverInfo();
		InsertWarehouse();
		InsertWarehouseWorkerInfo();
		InsertUnitMeasureWeight();
		InsertParcel();
		InsertWholeRequest();
		InsertWarehouseConnection();
		InsertA2ARequest();
		InsertD2ARequest();
		InsertCSDepartment();
		InsertCSWorkerInfo();
		InsertBoard();
		InsertBoardAnswer();
		InsertFedexMarket();
		InsertFedexInventory();
		InsertPickup();
		InsertDelegateInfo();
		InsertWorkerBasePay();
		InsertRegulatedBasePay();
		InsertRequestMiniumCharge();
	}
	
	public void InsertCustomerInfo() {
		driver.InsertCustomerInfo("1","Peter", "Jone", "White", "12 1234 5678","123 1111 2222");
		driver.InsertCustomerInfo("2","Genevieve", "Lana", "Cheona", "03 5545 5378","123 2222 3333");
		driver.InsertCustomerInfo("3","Zendaya", "Faizan", "Anderson", "08 6986 3434","123 4444 5555");
		driver.InsertCustomerInfo("4","Carolos", "Kira", "Akpabio", "12 3434 2424","123 6666 7777");
		driver.InsertCustomerInfo("5","Elisa", "Lainey", "Lenkov", "12 5757 8989","123 5555 2342");
		driver.InsertCustomerInfo("6","Famke", "Valentin", "Bianchi", "12 0987 8765","123 2347 8458");
		driver.InsertCustomerInfo("7","Ansley", "Van", "Johnson", "12 3454 4565","123 4831 5758");
		driver.InsertCustomerInfo("8","Kavya", "Artem", "Agrinya", "12 4545 8908","123 4734 6966");
		driver.InsertCustomerInfo("9","Katharina", "Jozefa", "Ailana", "12 4342 5464","545 6787 2756");
		driver.InsertCustomerInfo("10","Sadhbh", "Fionn", "Semenov", "12 4656 4545","243 4589 9632");
	}
	
	public void InsertCustomerAddress() {
		driver.InsertCustomerAddress("5824 Hester Squares","Gutmann Apt. 093", "1", "USA","Avondale" ,"Georgia",24332,6834563692499L,4342);
		driver.InsertCustomerAddress("307 Schaden Creek","7784 Mayert Mall", "2", "USA", "Kansas","Florida",21232,6542487656773L,4554);
		driver.InsertCustomerAddress("147 서초중앙로","2931 도산대로", "3", "South Korea", "서울특별시", "서울특별시",14535,7397457578633L,2343);
		driver.InsertCustomerAddress("6236 가락로","1533 영동대로", "4", "South Korea", "서울특별시", "서울특별시",57585,4262819252596L,1221);
		driver.InsertCustomerAddress("742 논현로","671 역삼로", "5", "South Korea", "서울특별시", "서울특별시",46738,8241645434378L,1111);
		driver.InsertCustomerAddress("149 영동대로","397 서초중앙로", "6", "South Korea", "서울특별시", "서울특별시",57383,7616537831826L,3434);
		driver.InsertCustomerAddress("6459 테헤란로","0739 언주로", "7", "South Korea", "서울특별시", "서울특별시",47474,4316537831826L,8768);
		driver.InsertCustomerAddress("1556 양재천로","7636 영동대로", "8", "South Korea", "서울특별시", "서울특별시",23423,3778250143150L,6563);
		driver.InsertCustomerAddress("973 논현로","9252 잠실로", "9", "South Korea", "서울특별시", "서울특별시",12364,5778250143150L,2317);
		driver.InsertCustomerAddress("149 영동대로","1533 영동대로", "10", "South Korea", "서울특별시", "서울특별시",43264,9975250143150L,2317);
	}
	

	public void InsertCustomerOrganization() {
		driver.InsertCustomerOrganization("withink","1","1434 2323");
		driver.InsertCustomerOrganization("mooners","2","3434 4543");
		driver.InsertCustomerOrganization("impaign","3","4747 4747");
		driver.InsertCustomerOrganization("econd","4","2334 4636");
		driver.InsertCustomerOrganization("overloo","5","1234 2345");
		driver.InsertCustomerOrganization("dustraw","6","8765 5643");
		driver.InsertCustomerOrganization("unmoval","7","4676 5425");
		driver.InsertCustomerOrganization("entokin","8","2478 6479");
		driver.InsertCustomerOrganization("sometes","9","2479 2479");
		driver.InsertCustomerOrganization("runched","10","6945 4268");
	}
	
	public void InsertPayment() {
		// 카드번호 16으로 바꿨고 expiration year는 2자리야 예진쿤
		driver.InsertPayment("1234123412341234", "1", "credit_card", "123", "23", "3");
		driver.InsertPayment("2345123412341234", "2", "credit_card", "234", "23", "4");
		driver.InsertPayment("3545123412341234", "3", "credit_card", "345", "23", "6");
		driver.InsertPayment("6464123412341234", "4", "credit_card", "456", "23", "7");
		driver.InsertPayment("7676123412341234", "5", "credit_card", "567", "24", "8");
		driver.InsertPayment("6868123412341234", "6", "credit_card", "678", "24", "8");
		driver.InsertPayment("2424123412341234", "7", "credit_card", "789", "24", "9");
		driver.InsertPayment("8787123412341234", "8", "credit_card", "876", "24", "10");
		driver.InsertPayment("9876123412341234", "9", "credit_card", "654", "24", "11");
		driver.InsertPayment("9675123412341234", "10", "credit_card", "543", "24", "12");
	}
	
	public void InsertArea() {
		driver.InsertArea("0000000001");
		driver.InsertArea("0000000010");
		driver.InsertArea("0000000100");
		driver.InsertArea("0000001000");
		driver.InsertArea("0000010000");
		driver.InsertArea("0000100000");
		driver.InsertArea("0001000000");
		driver.InsertArea("0010000000");
		driver.InsertArea("0100000000");
		driver.InsertArea("1000000000");
	}
	
	public void InsertWorker() {
		driver.InsertWorker("1","0000000001","Elbert","Whitehead","Daphne","03 1212 2424","123 1234 1234","2020-09-21");	
		driver.InsertWorker("2","0000000010","Daphne","Lambert","Gray","04 4546 4321","234 8765 1234","2020-11-11");	
		driver.InsertWorker("3","0000000100","Anthony","Elmer","Spencer","05 3454 2424","123 5252 5432","2020-07-05");	
		driver.InsertWorker("4","0000001000","Bond","Pascall","Gordon","06 1212 6464","222 1234 8392","2020-04-08");	
		driver.InsertWorker("5","0000010000","Vincent","Leon","Malcom","02 1212 3557","344 6321 1234","2020-09-13");	
		driver.InsertWorker("6","0000100000","Harrison","Georgie","Fennimore","03 2444 7654","744 4422 1234","2021-04-15");	
		driver.InsertWorker("7","0001000000","Brian","Robertson","Parkinson","03 7654 6543","876 5432 2424","2022-05-19");	
		driver.InsertWorker("8","0010000000","Bobby","Cunningham","Beck","03 8654 2321","022 3453 1234","2019-04-23");	
		driver.InsertWorker("9","0100000000","Ike","Dolton","Frost","03 7433 4321","058 5432 6543","2019-09-11");	
		driver.InsertWorker("10","1000000000","Sterling","Zeph","Geis","03 6543 8765","274 1234 8765","2019-08-18");	

		driver.InsertWorker("11","0000000001","Hannibal","Stephan","Peters","02 1324 4675","543 4753 1234","2021-02-21");	
		driver.InsertWorker("12","0000000010","Tucker","Derick","Gray","01 6745 4567","234 4567 2512","2022-04-23");	
		driver.InsertWorker("13","0000000100","Carl","Elmer","Robson","45 3564 4567","345 2534 4633","2021-03-13");	
		driver.InsertWorker("14","0000001000","Les","Pascall","Malcom","26 2453 6897","234 6845 1423","2018-02-08");	
		driver.InsertWorker("15","0000010000","Angela","Gordon","Mendoza","04 3421 7343","523 2455 1234","2019-01-13");	
		driver.InsertWorker("16","0000100000","Lucas","Kain","Abby","06 4675 6235","865 4422 3421","2017-05-15");	
		driver.InsertWorker("17","0001000000","Georgette","Robertson","Watts","04 5786 3467","123 9543 2424","2012-06-19");	
		driver.InsertWorker("18","0010000000","Linden","Mcbride","Weber","03 8654 7675","323 2352 1234","2020-07-23");	
		driver.InsertWorker("19","0100000000","Vera","Wood","Fletcher","02 8967 7654","123 1231 6543","2021-12-11");	
		driver.InsertWorker("20","1000000000","Beata","Magnus","Aguilar","01 7098 2346","234 6006 8765","2020-12-22");	
		
		driver.InsertWorker("21","0000000001","Sandoval","Benjamin","Robertson","03 1212 2424","123 1234 1234","2021-05-11");	
		driver.InsertWorker("22","0000000010","Grover","Wade","Pauley","04 4546 4321","234 8765 1234","2021-03-14");	
		driver.InsertWorker("23","0000000100","Albion","Elmer","Reynolds","05 3454 2424","123 5252 5432","2018-02-22");	
		driver.InsertWorker("24","0000001000","Penelope","Marvin","Stanley","06 1212 6464","222 1234 8392","2017-01-12");	
		driver.InsertWorker("25","0000010000","Kennard","Feron","Black","02 1212 3557","344 6321 1234","2013-06-23");	
		driver.InsertWorker("26","0000100000","Carmen","Soto","Nicholls","03 2444 7654","744 4422 1234","2020-07-02");	
		driver.InsertWorker("27","0001000000","Eugenia","Holmes","Parkinson","03 7654 6543","876 5432 2424","2021-08-19");	
		driver.InsertWorker("28","0010000000","Garth","Trista","Beck","03 8654 2321","022 3453 1234","2020-09-13");	
		driver.InsertWorker("29","0100000000","Rhea","Hersey","Frost","03 7433 4321","058 5432 6543","2021-10-10");	
		driver.InsertWorker("30","1000000000","Sarah","Vanessa","Harvey","03 6543 8765","274 1234 8765","2022-11-02");	
	}
	
	public void InsertSalaryLog() {
		driver.InsertSalaryLog("20200131","1","3000000","300000");		
		driver.InsertSalaryLog("20200430","2","3000000","300000");		
		driver.InsertSalaryLog("20200430","3","3000000","300000");		
		driver.InsertSalaryLog("20210331","4","3000000","300000");		
		driver.InsertSalaryLog("20210430","5","4000000","400000");		
		driver.InsertSalaryLog("20220531","6","4000000","400000");		
		driver.InsertSalaryLog("20220630","7","4000000","500000");		
		driver.InsertSalaryLog("20220731","8","5000000","500000");		
		driver.InsertSalaryLog("20220831","9","5000000","500000");		
		driver.InsertSalaryLog("20221031","10","5000000","500000");		
	}
	
	public void InsertNation() {
		driver.InsertNation("0000000001");
		driver.InsertNation("0000000010");
		driver.InsertNation("0000000100");
		driver.InsertNation("0000001000");
		driver.InsertNation("0000010000");
		driver.InsertNation("0000100000");
		driver.InsertNation("0001000000");
		driver.InsertNation("0010000000");
		driver.InsertNation("0100000000");
		driver.InsertNation("1000000000");
	}
	
	public void InsertDriverLicense() {
		driver.InsertDriverLicense("0000000001","0000000001");
		driver.InsertDriverLicense("0000000010","0000000010");
		driver.InsertDriverLicense("0000000100","0000000100");
		driver.InsertDriverLicense("0000001000","0000001000");
		driver.InsertDriverLicense("0000010000","0000010000");
		driver.InsertDriverLicense("0000100000","0000100000");
		driver.InsertDriverLicense("0001000000","0001000000");
		driver.InsertDriverLicense("0010000000","0010000000");
		driver.InsertDriverLicense("0100000000","0100000000");
		driver.InsertDriverLicense("1000000000","1000000000");	
	}
	
	public void InsertUnitMeasureSize() {
		driver.InsertUnitMeasureSize("0000000001");
		driver.InsertUnitMeasureSize("0000000010");
		driver.InsertUnitMeasureSize("0000000100");
		driver.InsertUnitMeasureSize("0000001000");
		driver.InsertUnitMeasureSize("0000010000");
		driver.InsertUnitMeasureSize("0000100000");
		driver.InsertUnitMeasureSize("0001000000");
		driver.InsertUnitMeasureSize("0010000000");
		driver.InsertUnitMeasureSize("0100000000");
		driver.InsertUnitMeasureSize("1000000000");
	}
	
	public void InsertVehicle() {
		driver.InsertVehicle("80배1234","0000000001","0000000001",122,234,345);
		driver.InsertVehicle("80배2345","0000000010","0000000001",745,654,431);
		driver.InsertVehicle("81배1234","0000000100","0000000001",123,654,345);
		driver.InsertVehicle("81배3456","0000001000","0000000001",765,745,453);
		driver.InsertVehicle("81배4567","0000010000","0000000010",465,235,856);
		driver.InsertVehicle("82배7643","0000100000","0000000010",685,457,463);
		driver.InsertVehicle("82배4326","0001000000","0000000010",967,574,685);
		driver.InsertVehicle("83배8765","0010000000","0000000010",685,679,967);
		driver.InsertVehicle("83배3245","0100000000","0000000010",965,865,634);
		driver.InsertVehicle("84배7532","1000000000","0000000010",634,586,967);
	}
	
	public void InsertDriverInfo() {
		driver.InsertDriverInfo("1","80배1234","0000000001");
		driver.InsertDriverInfo("2","80배2345","0000000010");
		driver.InsertDriverInfo("3","81배1234","0000000100");
		driver.InsertDriverInfo("4","81배3456","0000001000");
		driver.InsertDriverInfo("5","81배4567","0000010000");
		driver.InsertDriverInfo("6","82배7643","0000100000");
		driver.InsertDriverInfo("7","82배4326","0001000000");
		driver.InsertDriverInfo("8","83배8765","0010000000");
		driver.InsertDriverInfo("9","83배3245","0100000000");
		driver.InsertDriverInfo("10","84배7532","1000000000");
	}
	
	public void InsertWarehouse() {
		driver.InsertWarehouse("1","0000000001","Memphis hub");
		driver.InsertWarehouse("2","0000000010","Guangzhou hub");
		driver.InsertWarehouse("3","0000000100","Osaka–Kansai hub");
		driver.InsertWarehouse("4","0000001000","Seoul–Incheon hub");
		driver.InsertWarehouse("5","0000010000","Shanghai–Pudong hub");
		driver.InsertWarehouse("6","0000100000","Singapore hub");
		driver.InsertWarehouse("7","0001000000","Toronto–Pearson hub");
		driver.InsertWarehouse("8","0010000000","Cologne/Bonn hub");
		driver.InsertWarehouse("9","0100000000","Liège hub");
		driver.InsertWarehouse("10","1000000000","Milan–Malpensa hub");
	}
	
	public void InsertWarehouseWorkerInfo() {
		driver.InsertWarehouseWorkerInfo("11","1");
		driver.InsertWarehouseWorkerInfo("12","2");
		driver.InsertWarehouseWorkerInfo("13","3");
		driver.InsertWarehouseWorkerInfo("14","4");
		driver.InsertWarehouseWorkerInfo("15","5");
		driver.InsertWarehouseWorkerInfo("16","6");
		driver.InsertWarehouseWorkerInfo("17","7");
		driver.InsertWarehouseWorkerInfo("18","8");
		driver.InsertWarehouseWorkerInfo("19","9");
		driver.InsertWarehouseWorkerInfo("20","10");
	}
	
	public void InsertUnitMeasureWeight() {
		driver.InsertUnitMeasureWeight("0000000001");
		driver.InsertUnitMeasureWeight("0000000010");
		driver.InsertUnitMeasureWeight("0000000100");
		driver.InsertUnitMeasureWeight("0000001000");
		driver.InsertUnitMeasureWeight("0000010000");
		driver.InsertUnitMeasureWeight("0000100000");
		driver.InsertUnitMeasureWeight("0001000000");
		driver.InsertUnitMeasureWeight("0010000000");
		driver.InsertUnitMeasureWeight("0100000000");
		driver.InsertUnitMeasureWeight("1000000000");	
	}
	
	public void InsertParcel() {
		driver.InsertParcel("1","1","0000000001","0000000001",321,32,1,0);
		driver.InsertParcel("2","2","0000000001","0000000001",32,24,21,0);
		driver.InsertParcel("3","3","0000000001","0000000001",12,345,45,0);
		driver.InsertParcel("4","4","0000000001","0000000001",243,45,324,0);
		driver.InsertParcel("5","5","0000000001","0000000001",22,46,24,0);
		driver.InsertParcel("6","6","0000000010","0000000010",132,46,23,1);
		driver.InsertParcel("7","7","0000000010","0000000010",54,76,17,1);
		driver.InsertParcel("8","8","0000000010","0000000010",65,34,23,1);
		driver.InsertParcel("9","9","0000000100","0000000100",46,345,21,1);
		driver.InsertParcel("10","10","0000000100","0000000100",35,27,50,1);	
	}
	
	public void InsertWholeRequest() {
		
	}
	// 여기까지
	public void InsertWarehouseConnection() {
		
	}
	
	public void InsertA2ARequest() {
		
	}
	
	public void InsertD2ARequest() {
		
	}
	
	public void InsertCSDepartment() {
		driver.InsertCSDepartment("1","0000000001");
		driver.InsertCSDepartment("2","0000000010");
		driver.InsertCSDepartment("3","0000000100");
		driver.InsertCSDepartment("4","0000001000");
		driver.InsertCSDepartment("5","0000010000");
		driver.InsertCSDepartment("6","0000100000");
		driver.InsertCSDepartment("7","0001000000");
		driver.InsertCSDepartment("8","0010000000");
		driver.InsertCSDepartment("9","0100000000");
		driver.InsertCSDepartment("10","1000000000");
	}

	
	public void InsertCSWorkerInfo() {
		driver.InsertCSWorkerInfo("1","5",3);
		driver.InsertCSWorkerInfo("2","2",10);
		driver.InsertCSWorkerInfo("3","3",5);
		driver.InsertCSWorkerInfo("4","7",1);
		driver.InsertCSWorkerInfo("5","6",8);
		driver.InsertCSWorkerInfo("6","4",9);
		driver.InsertCSWorkerInfo("7","1",7);
		driver.InsertCSWorkerInfo("8","9",2);
		driver.InsertCSWorkerInfo("9","10",4);
		driver.InsertCSWorkerInfo("10","8",6);
		driver.InsertCSWorkerInfo("11","10",6);
	}

	public void InsertBoard() {
		driver.InsertBoard("1","2",1,"언제도착하나요","안녕하세요 제 택배 언제 도착하나요",1);  
		driver.InsertBoard("2","6",3,"택배를 신청했는데","택배 신청했는데 언제 방문하시나요? ",1);
		driver.InsertBoard("3","7",2,"택배 없음","집앞에 택배 없는데 배송완료라고 뜨네요.. 확인부탁드립니다.",0);
		driver.InsertBoard("4","8",1,"내일 입어야 하는데","옷 언제배송 예정인가요?? 내일까지 꼭 받아야 돼요ㅜㅠㅜㅠ",1);
		driver.InsertBoard("5","1",3,"편의점에서","편의점에서 택배 보낼수있나여??",1);
		driver.InsertBoard("6","5",3,"물건 현재 위치","제 택배 어딨는지 어떻게 확인하나요",1);
		driver.InsertBoard("7","9",2,"택배 어디까지 왔어요?","제 택배 지금 어디까지 왔는지 어떻게 알아요??????",1);
		driver.InsertBoard("8","10",3,"국외 택배","어떻게 보내나요?",1);
		driver.InsertBoard("9","3",2,"배송완료아닌데 배송완료라고 함","아직 도착 안했는데 확인해보니 배송완료라는데요??",1);
		driver.InsertBoard("10","4",3,"공휴일에 배달 가능한가요?","공휴일에 배달 가능한가요? 일요일은요?",1);
		driver.InsertBoard("11","11",3,"인터넷 쇼핑?","인터넷 쇼핑으로 산거 반품 되나요?",1);
	}

	public void InsertBoardAnswer() {
		driver.InsertBoardAnswer("1","1","답변 드립니다.","당사 홈페이지 내의 [조회/예약]-[택배조회]를 이용하시면 이동경로 확인이 가능합니다.");
		driver.InsertBoardAnswer("2","2","답변 드립니다.","상품 인수를 위한 방문 희망 일로 지정하신 요청일에 방문합니다.");
		driver.InsertBoardAnswer("4","4","답변 드립니다.","당사 홈페이지 내의 [조회/예약]-[택배조회]를 이용하시면 이동경로 확인이 가능합니다.");
		driver.InsertBoardAnswer("5","5","답변 드립니다.","편의점으로 상품을 가져가시면 택배 서비스를 이용하실 수 있습니다. ");
		driver.InsertBoardAnswer("6","6","답변 드립니다.","당사 홈페이지 내의 [조회/예약]-[택배조회]를 이용하시면 이동경로 확인이 가능합니다.");
		driver.InsertBoardAnswer("7","7","답변 드립니다.","당사 홈페이지 내의 [조회/예약]-[택배조회]를 이용하시면 이동경로 확인이 가능합니다.");
		driver.InsertBoardAnswer("8","8","답변 드립니다.","해외로 물품을 보내시는 경우 가까운 편의점 중 Postbox가 설치된 곳에 내방하시면 접수 가능합니다.");
		driver.InsertBoardAnswer("9","9","답변 드립니다.","당사 홈페이지 내의 [조회/예약]-[택배조회]를 이용하시면 이동경로 확인이 가능합니다.");
		driver.InsertBoardAnswer("10","10","답변 드립니다.","공휴일과 일요일은 택배사 휴무로 방문이 어려우니 양해 바랍니다. 더 나은 서비스를 제공하기 위해 최선을 다하겠습니다.");
		driver.InsertBoardAnswer("11","11","답변 드립니다.","주문하신 물품 구입처에 반품 의사를 전달하시면 구매업체에서 직접 접수를 해주거나 택배사로 접수하시도록 안내를 받으실 수 있습니다. ");
	}
	
	public void InsertFedexMarket() {
		
	}
	
	public void InsertFedexInventory() {
		
	}
	
	public void InsertPickup() {
		
	}
	
	public void InsertDelegateInfo() {
		
	}
	
	public void InsertWorkerBasePay() {
		
	}
	
	public void InsertRegulatedBasePay() {
		
	}
	
	public void InsertRequestMiniumCharge() {
		
	}
	
}
