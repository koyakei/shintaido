package infomaticCurrency.money

import KumiteParticipant

interface MarketParticipant: KumiteParticipant {
    /**
     * 市場参加者は同じ目標を持っているわけじゃないんだけど、自分が操作可能な通貨の　cardinalNumberを無限大にしようとする
     * 通貨だと無限大だとは言えないだろう。　栄光の条件として無限大があるが、ここの目標を無限大にとれるかは関係しているはず。
     */
}