/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2013 Marek Mikuliszyn
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package strategyhub;

import com.dukascopy.api.*;
import com.dukascopy.api.feed.IFeedDescriptor;
import com.dukascopy.api.feed.IRangeBar;
import com.dukascopy.api.feed.IRenkoBar;
import signal.Signal;

public interface AStrategy {

    public void onRangeBar(Instrument instrument, OfferSide offerSide, PriceRange priceRange, IRangeBar bar, IFeedDescriptor feedDescriptor);

    public void onRenkoBar(Instrument instrument, OfferSide offerSide, PriceRange priceRange, IRenkoBar bar, IFeedDescriptor feedDescriptor);

    public void onTick(Instrument instrument, ITick tick);

    public void onBar(Instrument instrument, Period period, IBar bar, IFeedDescriptor feedDescriptor);

    public void onStart();

    public void onStop();

    public void onTP(IOrder order);

    public void onSL(IOrder order);

    public void newSignal(Signal signal);

    public void signalUP(Signal signal);

    public void signalDOWN(Signal signal);
}