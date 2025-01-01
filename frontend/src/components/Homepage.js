import React from "react";
import {
  AppBar,
  Toolbar,
  Typography,
  IconButton,
  InputBase,
  Box,
  Avatar,
  List,
  ListItem,
  ListItemText,
  Button,
} from "@mui/material";
import { Search, Favorite } from "@mui/icons-material";

const Homepage = () => {
  return (
    <Box display="flex" minHeight="100vh" bgcolor="#181818" color="white">
      {/* Sidebar */}
      <Box width="15%" bgcolor="#121212" p={2}>
        <Typography variant="h6" gutterBottom>
          Groovy
        </Typography>
        <List>
          {["Explore", "Genres", "Albums", "Artists", "Radio"].map((item) => (
            <ListItem button key={item}>
              <ListItemText primary={item} />
            </ListItem>
          ))}
        </List>
        <Typography variant="h6" gutterBottom style={{ marginTop: "16px" }}>
          Library
        </Typography>
        <List>
          {["Recent", "Albums", "Favorites", "Local"].map((item) => (
            <ListItem button key={item}>
              <ListItemText primary={item} />
            </ListItem>
          ))}
        </List>
      </Box>

      {/* Main Content */}
      <Box flex={1} p={4}>
        {/* Header */}
        <AppBar position="static" color="transparent" elevation={0}>
          <Toolbar>
            <InputBase
              placeholder="Search…"
              style={{
                backgroundColor: "#252525",
                borderRadius: "8px",
                padding: "4px 8px",
                marginRight: "auto",
                color: "white",
              }}
            />
            <IconButton>
              <Favorite style={{ color: "white" }} />
            </IconButton>
            <Avatar alt="User" src="/path-to-avatar.jpg" />
          </Toolbar>
        </AppBar>

        {/* Trending Section */}
        <Box mt={4}>
          <Typography variant="h4" gutterBottom>
            Trending New Hits
          </Typography>
          <Box display="flex" gap={2}>
            <Box flex={2} bgcolor="#252525" p={2} borderRadius="8px">
              <Typography variant="h5">In My Feelings</Typography>
              <Typography variant="subtitle1">Camila Cabello</Typography>
              <Typography variant="body2">63 Million Plays</Typography>
              <Button
                variant="contained"
                color="primary"
                style={{ marginTop: "16px" }}
              >
                Listen Now
              </Button>
            </Box>
            <Box flex={1} bgcolor="#252525" p={2} borderRadius="8px">
              <Typography variant="h6">Player</Typography>
              <Typography variant="subtitle1">Butterfly Effect</Typography>
              <Typography variant="caption">Travis Scott</Typography>
            </Box>
          </Box>
        </Box>

        {/* Top Artists */}
        <Box mt={4}>
          <Typography variant="h6" gutterBottom>
            Top Artists
          </Typography>
          <Box display="flex" gap={2}>
            {["Travis Scott", "Billie Eilish", "Nicki Minaj"].map((artist) => (
              <Box key={artist} textAlign="center">
                <Avatar
                  alt={artist}
                  src="/path-to-artist.jpg"
                  sx={{ width: 64, height: 64, margin: "0 auto" }}
                />
                <Typography variant="body2">{artist}</Typography>
              </Box>
            ))}
          </Box>
        </Box>

        {/* Genres */}
        <Box mt={4}>
          <Typography variant="h6" gutterBottom>
            Genres
          </Typography>
          <Box display="flex" gap={2}>
            {["Dance Beat", "Hip Hop", "Classical"].map((genre) => (
              <Box
                key={genre}
                bgcolor="#252525"
                p={2}
                borderRadius="8px"
                textAlign="center"
              >
                <Typography>{genre}</Typography>
              </Box>
            ))}
          </Box>
        </Box>
      </Box>
    </Box>
  );
};

export default Homepage;
