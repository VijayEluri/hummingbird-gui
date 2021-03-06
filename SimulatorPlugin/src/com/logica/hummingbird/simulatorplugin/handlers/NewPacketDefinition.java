package com.logica.hummingbird.simulatorplugin.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;

import com.logica.hummingbird.simulatorplugin.packetdesigner.editors.PacketDesignEditorInput;
import com.logica.hummingbird.simulatorplugin.packetdesigner.editors.PacketDesignerEditor;
import com.logica.hummingbird.simulatorplugin.packetdesigner.model.SimPacket;
import com.logica.hummingbird.simulatorplugin.packetdesigner.model.SimPacketDesign;
import com.logica.hummingbird.simulatorplugin.packetdesigner.model.SimParameter;

public class NewPacketDefinition extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		PacketDesignEditorInput input = new PacketDesignEditorInput();
		SimPacket newPacket = new SimPacket("Test Packet");
		newPacket.addParameter(new SimParameter("Test Parameter A", Integer.class, 5));
		newPacket.addParameter(new SimParameter("Test Parameter B", Double.class, 10));
		newPacket.addParameter(new SimParameter("Test Parameter C", String.class, "OK"));

		// PacketDesign.getInstance().setPacket(newPacket);
		SimPacketDesign pd = new SimPacketDesign();
		pd.setPacket(newPacket);
		input.setPacketDesign(pd);

		IWorkbenchPage page = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage();

		try {
			page.openEditor(input, PacketDesignerEditor.ID);
		}
		catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
}
