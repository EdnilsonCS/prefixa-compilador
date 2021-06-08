/* This file was generated by SableCC (http://www.sablecc.org/). */

package prefixa.node;

import prefixa.analysis.*;

@SuppressWarnings("nls")
public final class TEndBlock extends Token
{
    public TEndBlock()
    {
        super.setText("end");
    }

    public TEndBlock(int line, int pos)
    {
        super.setText("end");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TEndBlock(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTEndBlock(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TEndBlock text.");
    }
}