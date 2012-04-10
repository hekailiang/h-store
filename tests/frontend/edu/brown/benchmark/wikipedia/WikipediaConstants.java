package edu.brown.benchmark.wikipedia;

import org.voltdb.VoltTable;
import org.voltdb.VoltType;

public abstract class WikipediaConstants {

    /**
     * The percentage of page updates that are made by anonymous users [0%-100%]
     */
    public static final int ANONYMOUS_PAGE_UPDATE_PROB = 26; 
    
    /**
     * 
     */
    public static final int ANONYMOUS_USER_ID = 0;
    
    public static final double USER_ID_SIGMA = 1.0001d;
    
	/**
	 * Length of the tokens
	 */
	public static final int TOKEN_LENGTH = 32;

	/**
	 * Number of baseline pages
	 */
	public static final int PAGES = 1000;

	/**
	 * Number of baseline Users
	 */
	public static final int USERS = 2000;
	
	public static final String UPDATEPAGE_LOG_TYPE = "patrol";
	
	public static final String UPDATEPAGE_LOG_ACTION = "patrol";
	
    // -----------------------------------------------------------------
    // GET PAGE OUTPUT COLUMNS
    // -----------------------------------------------------------------
    
    public static final VoltTable.ColumnInfo[] GETPAGE_OUTPUT_COLS = {
        new VoltTable.ColumnInfo("USER_TEXT", VoltType.STRING),
        new VoltTable.ColumnInfo("PAGE_ID", VoltType.INTEGER),
        new VoltTable.ColumnInfo("OLD_TEXT", VoltType.STRING),
        new VoltTable.ColumnInfo("TEXT_ID", VoltType.INTEGER),
        new VoltTable.ColumnInfo("REVISION_ID", VoltType.INTEGER),
    };
	
    // ----------------------------------------------------------------
	// DISTRIBUTION CONSTANTS
    // ----------------------------------------------------------------

	public static final double NUM_WATCHES_PER_USER_SIGMA = 1.75d;
	
	public static final double WATCHLIST_PAGE_SIGMA = 1.0001d;
	
	public static final double REVISION_USER_SIGMA = 1.0001d;
	
    // ----------------------------------------------------------------
    // DATA SET INFORMATION
    // ----------------------------------------------------------------
    
    /**
     * Table Names
     */
	public static final String TABLENAME_IPBLOCKS          = "ipblocks";
	public static final String TABLENAME_LOGGING           = "logging";
	public static final String TABLENAME_PAGE              = "page";
	public static final String TABLENAME_PAGE_BACKUP       = "page_backup";
	public static final String TABLENAME_PAGE_RESTRICTIONS = "page_restrictions";
	public static final String TABLENAME_RECENTCHANGES     = "recentchanges";
	public static final String TABLENAME_REVISION          = "revision";
	public static final String TABLENAME_TEXT              = "text";
	public static final String TABLENAME_USER              = "useracct";
	public static final String TABLENAME_USER_GROUPS       = "user_groups";
	public static final String TABLENAME_VALUE_BACKUP      = "value_backup";
	public static final String TABLENAME_WATCHLIST         = "watchlist";
	
	// ----------------------------------------------------------------
    // STORED PROCEDURE INFORMATION
    // ----------------------------------------------------------------

    public static final int FREQUENCY_ADD_WATCHLIST = 100;
    public static final int FREQUENCY_GET_PAGE_ANONYMOUS = 0;
    public static final int FREQUENCY_GET_PAGE_AUTHENTICATED = 0;
    public static final int FREQUENCY_REMOVE_WATCHLIST = 0;
    public static final int FREQUENCY_UPDATE_PAGE = 0;
	
	public static final int BATCH_SIZE = 1000;

}
