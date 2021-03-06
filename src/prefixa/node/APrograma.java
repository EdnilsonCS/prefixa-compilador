/* This file was generated by SableCC (http://www.sablecc.org/). */

package prefixa.node;

import java.util.*;
import prefixa.analysis.*;

@SuppressWarnings("nls")
public final class APrograma extends PPrograma
{
    private final LinkedList<PDeclVar> _declVar_ = new LinkedList<PDeclVar>();
    private final LinkedList<PDeclFunc> _declFunc_ = new LinkedList<PDeclFunc>();

    public APrograma()
    {
        // Constructor
    }

    public APrograma(
        @SuppressWarnings("hiding") List<PDeclVar> _declVar_,
        @SuppressWarnings("hiding") List<PDeclFunc> _declFunc_)
    {
        // Constructor
        setDeclVar(_declVar_);

        setDeclFunc(_declFunc_);

    }

    @Override
    public Object clone()
    {
        return new APrograma(
            cloneList(this._declVar_),
            cloneList(this._declFunc_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPrograma(this);
    }

    public LinkedList<PDeclVar> getDeclVar()
    {
        return this._declVar_;
    }

    public void setDeclVar(List<PDeclVar> list)
    {
        this._declVar_.clear();
        this._declVar_.addAll(list);
        for(PDeclVar e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    public LinkedList<PDeclFunc> getDeclFunc()
    {
        return this._declFunc_;
    }

    public void setDeclFunc(List<PDeclFunc> list)
    {
        this._declFunc_.clear();
        this._declFunc_.addAll(list);
        for(PDeclFunc e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._declVar_)
            + toString(this._declFunc_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._declVar_.remove(child))
        {
            return;
        }

        if(this._declFunc_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PDeclVar> i = this._declVar_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PDeclVar) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<PDeclFunc> i = this._declFunc_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PDeclFunc) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
