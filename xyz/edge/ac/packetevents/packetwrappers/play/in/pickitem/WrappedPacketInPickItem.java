package xyz.edge.ac.packetevents.packetwrappers.play.in.pickitem;

import xyz.edge.ac.packetevents.packetwrappers.NMSPacket;
import xyz.edge.ac.packetevents.packetwrappers.WrappedPacket;

public class WrappedPacketInPickItem extends WrappedPacket
{
    public WrappedPacketInPickItem(final NMSPacket packet) {
        super(packet);
    }
    
    public int getSlot() {
        return this.readInt(0);
    }
    
    public void setSlot(final int slot) {
        this.writeInt(0, slot);
    }
}