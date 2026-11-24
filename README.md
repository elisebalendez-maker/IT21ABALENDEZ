Lesson 6: Polymorphism and Abstraction

Part 1 – PolymorphismDemo.java

This program shows kung giunsa pag-work ang polymorphism gamit ang notification system. We have one parent class nga `Notification` ug duha ka child classes nga `EmailNotification` ug `SMSNotification`.

Then ang duha ka child classes naggamit sa same method nga `sendMessage()`, pero lahi ilang output kay naay gi something-something over ride nila ang method gikan sa parent class.

Gamit dayun nato ang parent-class reference, pwede na nato matawag ang method sa lhi lahi nga child objects.

Part 2 – AbstractionDemo.java

 This program shows abstraction gamit ang payment system. We have abstract class nga gitawag ug `PaymentMethod` ug naay abstract method nga `processPayment()` then regular method nga `showReceipt()`.

Ang child classes nga `CashPayment` ug `GCashPayment` nag-extend sa abstract class. Sila ang nagpa implement sa `processPayment()`.

How Polymorphism Works:

Makita sa akong program kung giunsa sa polymorphism pag gamit ang parent-class reference para sa lahi lahi nga child objects.

- Parent class: `Notification`
- Child classes: `EmailNotification` ug `SMSNotification`
- Overridden method: `sendMessage()`

even though parehas ang method name, lahi ang mahitabo depende kung unsang child object ang gigamit. For example, kung EmailNotification ang object, Email notification ang iyang output. Kung SMSNotification pud, SMS notification ang iyang output.

How Abstraction Works

Sa akong program, ang abstraction makita pinaagi sa paggamit sa abstract class nga `PaymentMethod`. Dili kinahanglan ipakita tanan details sa parent class kay ang child classes na ang bahala sa paghatag sa ilang kaugalingong implementation.

- Abstract class: `PaymentMethod`
- Abstract method: `processPayment()`
- Regular method: `showReceipt()`
- Child classes: `CashPayment` ug `GCashPayment`

Ang `CashPayment` ug `GCashPayment` adunay kaugalingong version sa `processPayment()`, pero parehas silang makagamit sa `showReceipt()` nga gikan sa parent class.

Difference Between Polymorphism and Abstraction

Para nako, ang main difference nila kay ang polymorphism nag-focus sa usa ka method nga mahimong adunay lain-laing behavior depende sa object nga gigamit.

Ang abstraction pud nag-focus sa paghatag ug common structure sa mga classes ug pagtago sa unnecessary implementation details.

Both concepts makatabang para mas organized, reusable, ug sayon i-maintain ang atong program.

Reflection Questions and Answers

1. Why is method overriding important in polymorphism? What happens if a child class does not override the parent's method?

Importante ang method overriding kay through this, makahatag ang child class ug own behavior sa method nga nakuha niya sa parent class. Kung dili niya i-override ang method, ang method gikan sa parent class ang iyang gamiton. 

2. Why can't we create an object directly from an abstract class? What is the purpose of this restriction?

Dili ta makahimo ug object directly gikan sa abstract class kay dili pa complete ang iyang structure, especially if naa siyay abstract methods nga walay implementation. Ang purpose ani kay murag mapugos ang child classes nga maimplement ang methods nga gi require ayha magamit ang ilang objects.

3. If you need to add another child class to your polymorphism program, how would your existing code handle it?

Kung mag-add ko ug another child class, maghimo lang ko ug new class nga mo-extend sa `Notification` ug mo-override sa `sendMessage()`. Mahimo na dayon nako gamiton ang existing parent-class reference para tawagon ang new child object. Dili na kinahanglan usbon ang main structure sa program.

4. Can polymorphism and abstraction work together in a single program? Explain how and provide an example.

Yes, pwede kaayo silang mag-work together sa usa ka program. For example, sa payment system, mahimo nato gamiton ang abstract class nga `PaymentMethod` nga adunay abstract method nga `processPayment()`. Ang `CashPayment` ug `GCashPayment` mahimong child classes nga adunay kaugalingong implementation.

Pwede pud nato gamiton ang parent-class reference para tawagon ang method sa lain-laing payment objects. Dinhi makita nga nag-combine ang abstraction ug polymorphism.

5. As a future programmer, when would you use polymorphism, and when would you use abstraction?

As a future programmer, gamiton nako ang polymorphism kung gusto nako nga ang different classes makagamit sa same method pero lahi-lahi ang ilang actions or outputs.

Gamiton pud nako ang abstraction kung gusto nako maghimo ug common structure para sa related classes without showing all the implementation details.

Para nako, useful kaayo silang duha labi na kung maghimo ug larger programs kay makatabang sila nga mahimong organized, reusable, ug easier to update ang code.