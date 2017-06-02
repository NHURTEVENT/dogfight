package dogfight.vue;

import java.awt.event.KeyEvent;

import dogfight.controller.IOrderPerformer;
import dogfight.controller.UserOrder;
import dogfight.gameframe.IEventPerformer;

public class EventPerformer implements IEventPerformer{
	
	/*IOrderPerformer orderPerformer*/

	public EventPerformer(IOrderPerformer orderPerformer){
		
	}
	
	public void eventPerform(KeyEvent keycode){
		
	}
	
	private UserOrder keyCodeToUserOrder(int keyCode){
		return null;//<UserOrder>;
	}
	
}
