/* This file was generated by SableCC (http://www.sablecc.org/). */

package prefixa.node;

import java.util.*;
import prefixa.analysis.*;

@SuppressWarnings("nls")
public final class ABlocoFuncao extends PBlocoFuncao
{
    private final LinkedList<PDeclVar> _declVar_ = new LinkedList<PDeclVar>();
    private final LinkedList<PComando> _comando_ = new LinkedList<PComando>();
    private PExpReturn _expReturn_;

    public ABlocoFuncao()
    {
        // Constructor
    }

    public ABlocoFuncao(
        @SuppressWarnings("hiding") List<PDeclVar> _declVar_,
        @SuppressWarnings("hiding") List<PComando> _comando_,
        @SuppressWarnings("hiding") PExpReturn _expReturn_)
    {
        // Constructor
        setDeclVar(_declVar_);

        setComando(_comando_);

        setExpReturn(_expReturn_);

    }

    @Override
    public Object clone()
    {
        return new ABlocoFuncao(
            cloneList(this._declVar_),
            cloneList(this._comando_),
            cloneNode(this._expReturn_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABlocoFuncao(this);
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

    public LinkedList<PComando> getComando()
    {
        return this._comando_;
    }

    public void setComando(List<PComando> list)
    {
        this._comando_.clear();
        this._comando_.addAll(list);
        for(PComando e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    public PExpReturn getExpReturn()
    {
        return this._expReturn_;
    }

    public void setExpReturn(PExpReturn node)
    {
        if(this._expReturn_ != null)
        {
            this._expReturn_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expReturn_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._declVar_)
            + toString(this._comando_)
            + toString(this._expReturn_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._declVar_.remove(child))
        {
            return;
        }

        if(this._comando_.remove(child))
        {
            return;
        }

        if(this._expReturn_ == child)
        {
            this._expReturn_ = null;
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

        for(ListIterator<PComando> i = this._comando_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PComando) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._expReturn_ == oldChild)
        {
            setExpReturn((PExpReturn) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
