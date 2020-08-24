# CyclePricing-2
if you want command line terminal: press n
Sample Input :
Please provide Date : 
2015-08-10
Please provide chain : 
chain
Please provide wheels : 
tubeless
Please provide numbers of breaks for handle : 
3
Please provide frame : 
steelframe
Please provide seat : 
seat
output: 
chain price : 120.0
 FramePrice : 500.0
 HandleBarPrice : 450.0
 SeatingPrice : 100.0
 WheelPrice : 450.0
Total Price : 1620.0
 
If you want to upload a file press y and enter the path of the file as /Users/vishali/Downloads/test.txt
Added the sample file "test.com" for testing
uploading format:
2015-06-10
chain,steelframe,2,seat,tubeless

type of chain: chain
type of frame: steelframe
handle with brakes(please mention the no of breaks here): 3
type of seating: seat
type of wheel: tubeless for example



Explanation: CyclePricing is a main class, where we enter values like chain, steelframe,2,seat,tubeless. after entering values, CyclePricing calls getcycle() method of cyclehelper class. And getcycle() method will set the values of each individual components like seating, no of brakes ..etc. getcycle() method of cyclehelper will call each and every helperclass of all components like framehelper. for example getFrame() of framehelper class: in this method I have used map(better implemetation would be with database) for storing values like steelframe and pricing related to time. while setting the values , we will fetch the values from map depending upon the type of frame that is send by caller method. 
