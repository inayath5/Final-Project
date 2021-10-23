Adapter Design Pattern - 
I have created Adapter design pattern where BloodGroupStock and BloodDonRec are the Interfaces, BloodDonor and BloodReceiver are concrete classes, BloodBankAgentAdapter is adapter class implementing the OrderSingleItem interface and PostalConcrete is a concrete class implements BloodGroupStock. My main class is BMSAdapterMain.

Command Design Pattern - 
I have created Command Design Pattern where BloodTransportation is the interface, HospitalRequest is the request class, RejectRequest and ReceiveRequest is a concrete class implements BloodTransportation, BloodBankAgent is the broker class. The BMSCommandMain is the main class. 

Facade Design Pattern - 
I have created BMSFacadeMain as the main class, HospitalMgmt as interface, APositveGroup, BPositveGroup and ABPositveGroup as concrete classes implementing the same interface and BloodBank as facade class.

Factory Design Pattern - 
I have created BMSFacadeMain as the main class, HospitalMgmt as interface, APositveGroup, BPositveGroup and ABPositveGroup as concrete classes implementing the same interface and BloodBank as factory class to generate object of concrete class.