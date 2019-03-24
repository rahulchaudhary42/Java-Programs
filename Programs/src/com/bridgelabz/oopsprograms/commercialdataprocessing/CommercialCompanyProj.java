/**
 * a proj of the attributes of the company
 * such as stock name stock symbol,number of share,share price
 *  
 */
package com.bridgelabz.oopsprograms.commercialdataprocessing;
public class CommercialCompanyProj 
   {
		        private String stockName;
		        private String stockSymbol;
	        	private String noOFShare;
		        private String sharePrice;
	
				public CommercialCompanyProj()
				{		
				}
			
				public CommercialCompanyProj(String stockName, String stockSymbol, String noOFShare, String sharePrice)
				{
					super();
					this.stockName = stockName;
					this.stockSymbol = stockSymbol;
					this.noOFShare = noOFShare;
					this.sharePrice = sharePrice;
				}
				public String getStockName() 
				{
					return stockName;
				}
				public void setStockName(String stockName)
				{
					this.stockName = stockName;
				}
				public String getStockSymbol()
				{
					return stockSymbol;
				}
				public void setStockSymbol(String stockSymbol)
				{
					this.stockSymbol = stockSymbol;
				}
				public String getNoOFShare() 
				{
					return noOFShare;
				}
				public void setNoOFShare(String noOFShare)
				{
					this.noOFShare = noOFShare;
				}
				public String getSharePrice() 
				{
					return sharePrice;
				}
				public void setSharePrice(String sharePrice) 
				{
					this.sharePrice = sharePrice;
				}	
 }